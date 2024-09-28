package com.ragabys.presentation.login

import androidx.lifecycle.viewModelScope
import com.ragabys.presentation.composebase.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(

) : BaseViewModel<LoginViewState, LoginViewEvent>(){
    override fun createInitialState(): LoginViewState = LoginViewState.init()

    override fun onTriggerEvent(event: LoginViewEvent) {
        setEvent(event)
    }

    init {
        viewModelScope.launch {
            uiEvent.collect { event ->
                handleLoginViewEvent(event)
            }
        }
    }

    private suspend fun handleLoginViewEvent(event: LoginViewEvent) {
        when (event) {
            is LoginViewEvent.initAnimationLoading -> {}
        }
    }
}