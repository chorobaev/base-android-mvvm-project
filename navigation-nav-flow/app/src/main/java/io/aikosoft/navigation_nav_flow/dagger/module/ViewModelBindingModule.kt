package io.aikosoft.navigation_nav_flow.dagger.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import io.aikosoft.navigation_nav_flow.dagger.helper.mapkey.ViewModelKey
import io.aikosoft.navigation_nav_flow.factory.ViewModelFactory
import io.aikosoft.navigation_nav_flow.ui.home.HomeViewModel

@Module
interface ViewModelBindingModule {

    @Binds
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    fun bindHomeViewModel(homeViewModel: HomeViewModel): ViewModel
}