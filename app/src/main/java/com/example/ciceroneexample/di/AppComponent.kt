package com.example.ciceroneexample.di

import com.example.ciceroneexample.BaseActivity
import com.example.ciceroneexample.LightBlueFragment
import com.example.ciceroneexample.MainActivity
import com.example.ciceroneexample.MainMenuFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
    NavigationModule::class,
    LocalNavigationModule::class]
)
interface AppComponent {

    fun inject(activity: BaseActivity)
    fun inject(activity: MainActivity)
    fun inject(fragment: MainMenuFragment)

    fun inject(fragment: LightBlueFragment)
}