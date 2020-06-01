package io.aikosoft.base_mvvm_project.utils

import android.util.Log

interface MyLogger {

    fun log(msg: Any?) {
        Log.d(this.javaClass.simpleName, msg.toString())
    }
}