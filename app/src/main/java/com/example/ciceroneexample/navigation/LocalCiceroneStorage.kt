package com.example.ciceroneexample.navigation

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router


class LocalCiceroneStorage {

    private val containers = HashMap<Holder, Cicerone<Router>>()

    fun getCicerone(name: Holder): Cicerone<Router> =
        containers.getOrPut(name) { Cicerone.create() }

}


enum class Holder {
    ROOT,
    MAIN
}