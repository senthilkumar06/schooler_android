package com.randomthoughts.schooler.network.views

import android.support.v7.app.AppCompatActivity
import android.view.View

open class BaseActivity : AppCompatActivity() {

    override fun onResume() {
        super.onResume()
        hideBar()
    }

    private fun hideBar() {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or View.SYSTEM_UI_FLAG_IMMERSIVE
    }
}