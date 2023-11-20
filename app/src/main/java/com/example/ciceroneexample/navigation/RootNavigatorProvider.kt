package com.example.ciceroneexample.navigation

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RootNavigatorProvider @Inject constructor(
    storage: LocalCiceroneStorage
) {

    private val mLocalCicerone = storage.getCicerone(Holder.ROOT)

    fun open(screen: Screen) {
        mLocalCicerone.open(screen)
    }

}