package com.randomthoughts.schooler.network

import android.app.Application
import com.randomthoughts.schooler.network.dependancyinjection.ComponentInjector
import com.randomthoughts.schooler.network.utils.SharedPreferenceUtil

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        ComponentInjector.init()
        SharedPreferenceUtil.getInstance(this)
    }
}