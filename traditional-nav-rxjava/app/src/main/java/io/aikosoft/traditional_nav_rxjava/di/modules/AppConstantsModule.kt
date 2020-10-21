package io.aikosoft.traditional_nav_rxjava.di.modules

import dagger.Module
import dagger.Provides
import io.aikosoft.traditional_nav_rxjava.di.utils.BaseUrl
import javax.inject.Singleton

@Module
class AppConstantsModule {

    @get:Provides
    @get:Singleton
    @get:BaseUrl
    val baseUrl: String = "YOUR_ENDPOINT"
}