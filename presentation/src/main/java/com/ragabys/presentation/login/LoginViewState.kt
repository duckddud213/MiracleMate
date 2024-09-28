package com.ragabys.presentation.login

import com.ragabys.presentation.composebase.ViewState

sealed class LoginViewState : ViewState {
    abstract val isAnimationPlaying : Boolean
    abstract val isTryingAutoLogin : Boolean
    abstract val isTryingLogin : Boolean

    data class init(
        override val isAnimationPlaying: Boolean = true,
        override val isTryingAutoLogin: Boolean = false,
        override val isTryingLogin: Boolean = false,
    ) : LoginViewState()

    data class AutoLogin(
        override val isAnimationPlaying: Boolean = true,
        override val isTryingAutoLogin: Boolean = true,
        override val isTryingLogin: Boolean = false,
    ) : LoginViewState()

    data class Default(
        override val isAnimationPlaying: Boolean = true,
        override val isTryingAutoLogin: Boolean = false,
        override val isTryingLogin: Boolean = false
    ) : LoginViewState()

    data class Login(
        override val isAnimationPlaying: Boolean = true,
        override val isTryingAutoLogin: Boolean = false,
        override val isTryingLogin: Boolean = true
    )    : LoginViewState()
}