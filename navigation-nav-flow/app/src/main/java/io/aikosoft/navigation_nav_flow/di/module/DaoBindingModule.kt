package io.aikosoft.navigation_nav_flow.di.module

import dagger.Binds
import dagger.Module
import io.aikosoft.navigation_nav_flow.data.dao.ISampleRepository
import io.aikosoft.navigation_nav_flow.data.dao.implementation.SampleRepository

@Module
interface DaoBindingModule {

    @Binds
    fun bindAuthRepository(repo: SampleRepository): ISampleRepository
}