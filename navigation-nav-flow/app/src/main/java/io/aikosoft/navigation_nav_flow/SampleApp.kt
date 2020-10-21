package io.aikosoft.navigation_nav_flow

import android.app.Application
import io.aikosoft.navigation_nav_flow.dagger.DaggerAppComponent

class SampleApp : Application() {

    val appComponent by lazy {
        DaggerAppComponent.builder()
            .inject(this)
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        var instance: SampleApp? = null
    }
}