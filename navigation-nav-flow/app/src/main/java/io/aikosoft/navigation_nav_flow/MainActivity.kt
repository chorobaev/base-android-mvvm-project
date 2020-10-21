package io.aikosoft.navigation_nav_flow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.aikosoft.navigation_nav_flow.factory.InjectingFragmentFactory
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var fragmentFactory: InjectingFragmentFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        SampleApp.instance?.appComponent?.inject(this)
        supportFragmentManager.fragmentFactory = fragmentFactory
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}