package io.aikosoft.navigation_nav_flow.dagger.module

import dagger.Binds
import dagger.Module
import io.aikosoft.navigation_nav_flow.data.repository.ISampleRepository
import io.aikosoft.navigation_nav_flow.data.repository.implementation.SampleRepository

@Module
interface RepositoryBindingModule {

    @Binds
    fun bindAuthRepository(repo: SampleRepository): ISampleRepository
}