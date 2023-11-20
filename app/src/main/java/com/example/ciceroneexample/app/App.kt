package com.example.ciceroneexample.app

import android.app.Application
import com.example.ciceroneexample.di.AppDi

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        AppDi.init()
    }

}