package io.aikosoft.base_mvvm_project.di.modules

import dagger.Module
import dagger.Provides
import io.aikosoft.base_mvvm_project.di.utils.BaseUrl
import javax.inject.Singleton

@Module
class AppConstantsModule {

    @get:Provides
    @get:Singleton
    @get:BaseUrl
    val baseUrl: String = "YOUR_ENDPOINT"
}