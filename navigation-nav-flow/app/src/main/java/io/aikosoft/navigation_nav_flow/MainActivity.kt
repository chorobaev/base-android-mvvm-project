package io.aikosoft.navigation_nav_flow

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import io.aikosoft.navigation_nav_flow.factory.InjectingFragmentFactory
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var fragmentFactory: InjectingFragmentFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.fragmentFactory = fragmentFactory
        setContentView(R.layout.activity_main)
    }
}