package com.example.ciceroneexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ciceroneexample.di.AppDi
import com.example.ciceroneexample.navigation.AppNavigatorActivityAdapter
import com.example.ciceroneexample.navigation.IRootNavigatorFactory
import javax.inject.Inject


open class BaseActivity(layoutRes: Int) : AppCompatActivity(layoutRes) {

    @Inject
    protected lateinit var rootNavigatorFactory: IRootNavigatorFactory

    open val navigator
        get() = rootNavigatorFactory.get(AppNavigatorActivityAdapter(this))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppDi.get().inject(this)
    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        navigator.attach()
    }

    override fun onPause() {
        navigator.detach()
        super.onPause()
    }

}



