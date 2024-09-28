package com.ragabys.presentation.login

import android.annotation.SuppressLint
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ragabys.presentation.theme.main_black
import com.ragabys.presentation.theme.main_white
import com.ragabys.presentation.theme.mmTypoGraphy
import com.ragabys.presentation.theme.point_green
import com.ragabys.presentation.theme.point_green_half_trans
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun LoginScreen(
    viewModel: LoginViewModel = hiltViewModel<LoginViewModel>(),
    onLoginSuccess: () -> Unit
) {
    val viewState = viewModel.uiState.collectAsState().value
    val context = LocalContext.current
    val snackbarHostState = remember { SnackbarHostState() }

    var startAnimation by remember { mutableStateOf(false) }
    val lineProgress = remember { Animatable(0f) }
    val coroutineScope = rememberCoroutineScope()

    if (viewState.isAnimationPlaying) {
        coroutineScope.launch {
            delay(800)
            startAnimation = true
            lineProgress.animateTo(
                targetValue = 1f,
                animationSpec = tween(
                    durationMillis = 1000,
                    easing = LinearEasing
                )
            )
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(main_black)

    ) {
        Text(
            modifier = Modifier
                .padding(bottom = 200.dp, end = 28.dp)
                .align(Alignment.CenterEnd),
            text = "Miracle Mate",
            style = mmTypoGraphy.titleLarge.merge(
                color = main_white,
                textAlign = TextAlign.End,
            ),
            fontSize = 40.sp
        )
        if(!startAnimation){
            Text(
                modifier = Modifier
                    .padding(bottom = 200.dp, end = 16.dp)
                    .align(Alignment.CenterEnd),
                text = ".",
                style = mmTypoGraphy.titleLarge.merge(
                    color = point_green,
                    textAlign = TextAlign.End,
                ),
                fontSize = 40.sp
            )
        }
        Canvas(
            modifier = Modifier
                .size(270.dp)
                .padding(bottom = 174.dp, end = 18.dp)
                .align(Alignment.CenterEnd)
        ) {
            // 애니메이션에 따라 선의 길이를 변화시키는 코드
            val endX = size.width * lineProgress.value // x 축 끝 좌표를 애니메이션 진행에 맞춰 조정

            drawLine(
                color = point_green_half_trans,
                start = Offset(size.width, size.height / 2), // 오른쪽 끝에서 시작
                end = Offset(size.width - (size.width * lineProgress.value), size.height / 2), // 애니메이션에 맞춰 왼쪽으로 그려짐
                strokeWidth = 20f
            )
        }

    }
}
