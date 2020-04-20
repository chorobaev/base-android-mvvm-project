package io.aikosoft.base_mvvm_project.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.aikosoft.base_mvvm_project.sevices.SampleService

@Module
interface ServiceBindingModule {

    @ContributesAndroidInjector
    fun bindLocationService(): SampleService
}