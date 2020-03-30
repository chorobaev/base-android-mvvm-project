package io.aikosoft.base_mvvm_project.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.aikosoft.base_mvvm_project.ui.main.MainActivity
import io.aikosoft.base_mvvm_project.ui.main.MainFragmentBindingModule

@Module
abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = [MainFragmentBindingModule::class])
    abstract fun bindMainActivity(): MainActivity
}