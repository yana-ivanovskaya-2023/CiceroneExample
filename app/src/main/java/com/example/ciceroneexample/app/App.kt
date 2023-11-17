package com.example.ciceroneexample.app

import android.app.Application
import android.content.Context
import com.example.ciceroneexample.AppNavigator
import com.example.ciceroneexample.IAppComponent
import com.example.ciceroneexample.IAppDependencies
import com.example.ciceroneexample.IAppNavigator
import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router


class App : Application() {

    override fun onCreate() {
        super.onCreate()
        IAppComponent.init(object : IAppDependencies {
            override val context: Context
                get() = applicationContext
            override val router: Router
                get() = cicerone.router
            override val appNavigator: IAppNavigator
                get() = AppNavigator(cicerone.router)
            override val cicerone: Cicerone<Router>
                get() = Cicerone.create()
        })
    }

}