package io.aikosoft.base_mvvm_project.di.modules

import dagger.Module
import dagger.Provides
import io.aikosoft.base_mvvm_project.data.network.SampleClient
import io.aikosoft.base_mvvm_project.data.repositories.SampleRepository
import io.aikosoft.base_mvvm_project.data.repositories.implementations.SampleRepositoryImpl
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun providesSampleRepository(
        sampleClient: SampleClient
    ): SampleRepository =
        SampleRepositoryImpl(sampleClient)
}