package com.example.ciceroneexample

import android.content.Context
import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import dagger.Module
import dagger.Provides

interface IAppDependencies {
    val context: Context
    val router: Router
    val appNavigator: IAppNavigator
    val cicerone: Cicerone<Router>
}

@Module
class AppModule {

    @Provides
    fun provideNavigatorHolder(
        cicerone: Cicerone<Router>
    ): NavigatorHolder = cicerone.getNavigatorHolder().also { println("provideNavigatorHolder $it") }

}