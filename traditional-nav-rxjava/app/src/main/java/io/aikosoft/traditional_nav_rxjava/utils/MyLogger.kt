package io.aikosoft.traditional_nav_rxjava.utils

import android.util.Log

interface MyLogger {

    fun log(msg: Any?) {
        Log.d(this.javaClass.simpleName, msg.toString())
    }
}