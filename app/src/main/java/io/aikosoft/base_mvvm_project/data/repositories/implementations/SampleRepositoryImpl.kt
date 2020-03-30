package io.aikosoft.base_mvvm_project.data.repositories.implementations

import io.aikosoft.base_mvvm_project.data.network.SampleClient
import io.aikosoft.base_mvvm_project.data.repositories.SampleRepository

class SampleRepositoryImpl(private val sampleClient: SampleClient) : SampleRepository