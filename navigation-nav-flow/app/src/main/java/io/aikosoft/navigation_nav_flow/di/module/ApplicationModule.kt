package io.aikosoft.navigation_nav_flow.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.aikosoft.navigation_nav_flow.MainActivity

@Module(
    includes = [
        AppConstantsModule::class,
        ViewModelBindingModule::class,
        DaoBindingModule::class,
        RetrofitModule::class
    ]
)
abstract class ApplicationModule {

    @ContributesAndroidInjector(
        modules = [FragmentBindingModule::class]
    )
    abstract fun mainActivityInjector(): MainActivity

}