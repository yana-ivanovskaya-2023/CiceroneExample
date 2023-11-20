package com.example.ciceroneexample.di

object AppDi {

    private var mComponent: AppComponent? = null

    fun init() {
        mComponent = DaggerAppComponent.builder().build()
    }

    fun get() = mComponent ?: throw IllegalAccessException("DaggerAppComponent not initialized")

}