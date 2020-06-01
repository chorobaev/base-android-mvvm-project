package io.aikosoft.base_mvvm_project.di.modules

import dagger.Binds
import dagger.Module
import io.aikosoft.base_mvvm_project.data.repositories.SampleRepository
import io.aikosoft.base_mvvm_project.data.repositories.implementations.SampleRepositoryImpl

@Module
interface RepositoryModule {

    @Binds
    fun providesSampleRepository(impl: SampleRepositoryImpl): SampleRepository
}