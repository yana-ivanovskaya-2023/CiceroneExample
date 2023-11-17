package com.example.ciceroneexample

import android.os.Bundle
import javax.inject.Inject

class MainActivity : BaseActivity(R.layout.activity_main) {

    @Inject
    lateinit var navigator: IAppNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        IAppComponent.get().inject(this)
        navigator.openScreen(Screen.Main(0))
    }

}

