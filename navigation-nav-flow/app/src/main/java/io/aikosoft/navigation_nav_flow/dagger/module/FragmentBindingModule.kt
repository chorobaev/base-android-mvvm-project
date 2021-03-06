package io.aikosoft.navigation_nav_flow.dagger.module

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import io.aikosoft.navigation_nav_flow.dagger.helper.mapkey.FragmentKey
import io.aikosoft.navigation_nav_flow.factory.InjectingFragmentFactory
import io.aikosoft.navigation_nav_flow.ui.home.HomeFragment

@Module
interface FragmentBindingModule {

    @Binds
    fun bindFragmentFactory(factory: InjectingFragmentFactory): FragmentFactory

    @Binds
    @IntoMap
    @FragmentKey(HomeFragment::class)
    fun bindMainFragment(mainFragment: HomeFragment): Fragment
}