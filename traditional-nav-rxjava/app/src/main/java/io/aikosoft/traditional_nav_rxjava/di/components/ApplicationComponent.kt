package io.aikosoft.traditional_nav_rxjava.di.components

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import io.aikosoft.traditional_nav_rxjava.di.modules.ApplicationModule
import io.aikosoft.traditional_nav_rxjava.di.modules.ContextModule
import io.aikosoft.traditional_nav_rxjava.ui.SampleApp
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ContextModule::class,
    AndroidSupportInjectionModule::class,
    ApplicationModule::class])
interface ApplicationComponent : AndroidInjector<DaggerApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }

    fun inject(application: SampleApp)
}