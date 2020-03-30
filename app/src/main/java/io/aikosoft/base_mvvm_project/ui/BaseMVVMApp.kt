package io.aikosoft.base_mvvm_project.ui

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import io.aikosoft.base_mvvm_project.di.components.DaggerApplicationComponent

class BaseMVVMApp : DaggerApplication() {

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
        private var instance: BaseMVVMApp? = null

        fun getInstance(): BaseMVVMApp = instance!!
    }
}