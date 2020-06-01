package io.aikosoft.navigation_nav_flow.di.module

import dagger.Module
import dagger.Provides
import io.aikosoft.navigation_nav_flow.di.helper.qualifier.BaseUrl
import javax.inject.Singleton

@Module
class AppConstantsModule {

    @get:Provides
    @get:Singleton
    @get:BaseUrl
    val baseUrl: String = "YOUR_ENDPOINT"
}