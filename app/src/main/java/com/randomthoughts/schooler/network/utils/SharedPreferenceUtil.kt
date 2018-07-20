package com.randomthoughts.schooler.network.utils

import android.content.Context
import android.content.SharedPreferences

class SharedPreferenceUtil private constructor(context: Context) {
    val prefs: SharedPreferences = context.getSharedPreferences(Constants.PREFS_FILENAME, 0)

    companion object : SingletonHolder<SharedPreferenceUtil, Context>(::SharedPreferenceUtil)
}