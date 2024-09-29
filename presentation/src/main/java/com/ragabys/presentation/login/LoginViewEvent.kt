package com.ragabys.presentation.login

import com.ragabys.presentation.composebase.ViewEvent

sealed class LoginViewEvent : ViewEvent {
    data object checkAutoLogin :LoginViewEvent()


}