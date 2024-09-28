package com.ragabys.miraclemate

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MiracleMateApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}