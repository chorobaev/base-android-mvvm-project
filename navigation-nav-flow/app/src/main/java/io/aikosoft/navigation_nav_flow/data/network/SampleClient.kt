package io.aikosoft.navigation_nav_flow.data.network

import kotlinx.coroutines.flow.Flow
import retrofit2.http.GET

interface SampleClient {

    @GET("")
    fun getFlow(): Flow<Unit>
}