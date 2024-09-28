package com.ragabys.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.ragabys.presentation.R

val mmMainFontFamily = FontFamily(
    Font(R.font.suseongbatang, FontWeight.Normal, FontStyle.Normal)
)

val mmSubFontFamily = FontFamily(
    Font(R.font.bmjua, FontWeight.Normal, FontStyle.Normal)
)

// Set of Material typography styles to start with
val mmTypoGraphy = Typography(

    titleLarge = TextStyle(
        fontFamily = mmMainFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 28.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.5.sp,
        textAlign = TextAlign.Center,
        color = main_black
    ),

    titleMedium = TextStyle(
        fontFamily = mmMainFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp,
        textAlign = TextAlign.Center,
        color = main_black
    ),

    titleSmall = TextStyle(
        fontFamily = mmMainFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 12.sp,
        letterSpacing = 0.5.sp,
        textAlign = TextAlign.Center,
        color = main_black
    ),

    bodyLarge = TextStyle(
        fontFamily = mmSubFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 28.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.5.sp,
        textAlign = TextAlign.Center,
        color = main_black
    ),

    bodyMedium = TextStyle(
        fontFamily = mmSubFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp,
        textAlign = TextAlign.Center,
        color = main_black
    ),

    bodySmall = TextStyle(
        fontFamily = mmSubFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 12.sp,
        letterSpacing = 0.5.sp,
        textAlign = TextAlign.Center,
        color = main_black
    )
)