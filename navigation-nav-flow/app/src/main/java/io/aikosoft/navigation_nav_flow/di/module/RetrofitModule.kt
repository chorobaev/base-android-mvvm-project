package io.aikosoft.navigation_nav_flow.di.module

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import io.aikosoft.navigation_nav_flow.data.network.SampleClient
import io.aikosoft.navigation_nav_flow.di.helper.qualifier.BaseUrl
import io.aikosoft.navigation_nav_flow.di.helper.qualifier.SampleApp
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class RetrofitModule {

    @Singleton
    @Provides
    fun provideGson(): Gson = GsonBuilder().setLenient().create()

    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .build()

    @Provides
    fun provideRetrofitBuilder(client: OkHttpClient, gson: Gson): Retrofit.Builder =
        Retrofit.Builder()
            .client(client)
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))

    @Singleton
    @Provides
    @SampleApp
    fun provideSampleAppRetrofit(
        @BaseUrl baseUrl: String,
        retrofitBuilder: Retrofit.Builder
    ): Retrofit = retrofitBuilder.baseUrl(baseUrl).build()

    @Singleton
    @Provides
    fun provideSampleClient(@SampleApp retrofit: Retrofit): SampleClient =
        retrofit.create(SampleClient::class.java)
}