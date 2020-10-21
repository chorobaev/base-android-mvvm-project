package io.aikosoft.traditional_nav_rxjava.data.repositories.implementations

import io.aikosoft.traditional_nav_rxjava.data.network.SampleClient
import io.aikosoft.traditional_nav_rxjava.data.repositories.SampleRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SampleRepositoryImpl @Inject constructor(
    private val sampleClient: SampleClient
) : SampleRepository