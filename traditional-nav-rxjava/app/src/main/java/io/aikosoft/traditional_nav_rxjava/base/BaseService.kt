package io.aikosoft.base_mvvm_project.base

import androidx.lifecycle.LifecycleService
import dagger.android.AndroidInjection
import io.aikosoft.base_mvvm_project.utils.MyLogger

abstract class BaseService : LifecycleService(), MyLogger {

    override fun onCreate() {
        AndroidInjection.inject(this)
        super.onCreate()
    }

}