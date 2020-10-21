package io.aikosoft.traditional_nav_rxjava.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.aikosoft.traditional_nav_rxjava.ui.main.MainActivity
import io.aikosoft.traditional_nav_rxjava.ui.main.MainFragmentBindingModule

@Module
interface ActivityBindingModule {

    @ContributesAndroidInjector(modules = [MainFragmentBindingModule::class])
    fun bindMainActivity(): MainActivity
}