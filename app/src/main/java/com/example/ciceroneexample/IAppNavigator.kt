package com.example.ciceroneexample

interface IAppNavigator {
    fun openScreen(screen: Screen)

    fun onBackPressed()
}