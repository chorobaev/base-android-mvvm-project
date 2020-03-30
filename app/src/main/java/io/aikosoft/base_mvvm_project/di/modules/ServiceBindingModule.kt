package io.aikosoft.base_mvvm_project.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.aikosoft.base_mvvm_project.sevices.SampleService

@Module
abstract class ServiceBindingModule {

    @ContributesAndroidInjector
    abstract fun bindLocationService(): SampleService
}