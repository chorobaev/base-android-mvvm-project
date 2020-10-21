package io.aikosoft.traditional_nav_rxjava.di.modules

import dagger.Binds
import dagger.Module
import io.aikosoft.traditional_nav_rxjava.data.repositories.SampleRepository
import io.aikosoft.traditional_nav_rxjava.data.repositories.implementations.SampleRepositoryImpl

@Module
interface RepositoryModule {

    @Binds
    fun providesSampleRepository(impl: SampleRepositoryImpl): SampleRepository
}