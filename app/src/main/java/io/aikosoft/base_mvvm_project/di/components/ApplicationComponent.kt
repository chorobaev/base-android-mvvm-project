package io.aikosoft.base_mvvm_project.di.components

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import io.aikosoft.base_mvvm_project.di.modules.ApplicationModule
import io.aikosoft.base_mvvm_project.di.modules.ContextModule
import io.aikosoft.base_mvvm_project.ui.BaseMVVMApp
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

    fun inject(application: BaseMVVMApp)
}