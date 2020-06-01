package io.aikosoft.base_mvvm_project.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.aikosoft.base_mvvm_project.ui.main.MainActivity
import io.aikosoft.base_mvvm_project.ui.main.MainFragmentBindingModule

@Module
interface ActivityBindingModule {

    @ContributesAndroidInjector(modules = [MainFragmentBindingModule::class])
    fun bindMainActivity(): MainActivity
}