package io.aikosoft.traditional_nav_rxjava.ui

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import io.aikosoft.traditional_nav_rxjava.di.components.DaggerApplicationComponent

class SampleApp : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val component = DaggerApplicationComponent.builder()
            .application(this)
            .build()
        component.inject(this)
        return component
    }

    companion object {
        private var instance: SampleApp? = null

        fun getInstance(): SampleApp = instance!!
    }
}