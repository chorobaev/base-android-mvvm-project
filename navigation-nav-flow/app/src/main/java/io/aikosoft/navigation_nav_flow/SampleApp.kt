package io.aikosoft.navigation_nav_flow

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import io.aikosoft.navigation_nav_flow.di.component.DaggerApplicationComponent

class SampleApp : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerApplicationComponent.builder()
            .application(this)
            .build()
            .apply { inject(this@SampleApp) }
}