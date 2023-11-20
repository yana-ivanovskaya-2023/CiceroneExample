package com.example.ciceroneexample

import android.os.Bundle
import com.example.ciceroneexample.di.AppDi

class MainActivity : BaseActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppDi.get().inject(this)
        navigator.openMainMenu()
    }

}

