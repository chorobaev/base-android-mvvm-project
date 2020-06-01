package io.aikosoft.base_mvvm_project.base

interface OnErrorListener {
    fun onError(error: Throwable)
    fun setErrorMessage(msg: String)
    fun setErrorMessage(msgRes: Int)
}