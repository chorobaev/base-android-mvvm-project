package io.aikosoft.traditional_nav_rxjava.base

interface OnErrorListener {
    fun onError(error: Throwable)
    fun setErrorMessage(msg: String)
    fun setErrorMessage(msgRes: Int)
}