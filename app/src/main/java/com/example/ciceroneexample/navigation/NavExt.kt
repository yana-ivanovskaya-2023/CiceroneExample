package com.example.ciceroneexample.navigation

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router

fun Cicerone<Router>.open(screen: Screen) {
    router.navigateTo(screen.value)
}