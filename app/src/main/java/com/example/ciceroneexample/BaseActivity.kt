package com.example.ciceroneexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.androidx.AppNavigator
import javax.inject.Inject


open class BaseActivity(layoutRes: Int) : AppCompatActivity(layoutRes) {

    @Inject
    protected lateinit var navigatorHolder: NavigatorHolder

    private val navigator
        get() = AppNavigator(this, R.id.root)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        IAppComponent.get().inject(this)
    }

    override fun onResumeFragments() {
        println("1 onResumeFragments")
        super.onResumeFragments()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        navigatorHolder.removeNavigator()
        super.onPause()
    }

}