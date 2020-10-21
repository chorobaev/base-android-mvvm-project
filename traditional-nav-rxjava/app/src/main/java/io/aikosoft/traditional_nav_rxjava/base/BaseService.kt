package io.aikosoft.traditional_nav_rxjava.base

import androidx.lifecycle.LifecycleService
import dagger.android.AndroidInjection
import io.aikosoft.traditional_nav_rxjava.utils.MyLogger

abstract class BaseService : LifecycleService(), MyLogger {

    override fun onCreate() {
        AndroidInjection.inject(this)
        super.onCreate()
    }

}