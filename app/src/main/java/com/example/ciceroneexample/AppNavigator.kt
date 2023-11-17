package com.example.ciceroneexample

import com.github.terrakok.cicerone.Router

class AppNavigator(
    private val router: Router
) : IAppNavigator {

    override fun openScreen(screen: Screen) {
        router.navigateTo(screen.value)
    }

    override fun onBackPressed() {
        router.backTo(null)
    }

}