package io.aikosoft.navigation_nav_flow.dagger

import dagger.BindsInstance
import dagger.Component
import io.aikosoft.navigation_nav_flow.MainActivity
import io.aikosoft.navigation_nav_flow.SampleApp
import io.aikosoft.navigation_nav_flow.dagger.module.*
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApplicationModule::class,
        FragmentBindingModule::class,
        ViewModelBindingModule::class,
        RepositoryBindingModule::class,
        RetrofitModule::class
    ]
)
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun inject(target: SampleApp): Builder
        fun build(): AppComponent
    }

    fun inject(target: MainActivity)

}