package io.aikosoft.traditional_nav_rxjava.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.aikosoft.traditional_nav_rxjava.sevices.SampleService

@Module
interface ServiceBindingModule {

    @ContributesAndroidInjector
    fun bindLocationService(): SampleService
}