package io.aikosoft.base_mvvm_project.data.repositories.implementations

import io.aikosoft.base_mvvm_project.data.network.SampleClient
import io.aikosoft.base_mvvm_project.data.repositories.SampleRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SampleRepositoryImpl @Inject constructor(
    private val sampleClient: SampleClient
) : SampleRepository