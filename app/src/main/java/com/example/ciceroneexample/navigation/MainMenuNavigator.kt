package com.example.ciceroneexample.navigation

import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

/**
 * Реализация навигации фрагментов внутри фрагмента
 */

@AssistedFactory
interface IMainMenuNavigatorFactory {
    fun get(appNavigator: AppNavigatorFragmentAdapter): MainMenuNavigator
}

class MainMenuNavigator @AssistedInject constructor(
    storage: LocalCiceroneStorage,
    @Assisted private val appNavigator: AppNavigatorFragmentAdapter
) {

    private val mLocalCicerone = storage.getCicerone(Holder.MAIN)

    fun attach() {
        mLocalCicerone.getNavigatorHolder().setNavigator(appNavigator.navigator)
    }

    fun detach() {
        mLocalCicerone.getNavigatorHolder().removeNavigator()
    }

    fun openRed() {
        mLocalCicerone.open(Screen.Red)
    }

    fun openOrange() {
        mLocalCicerone.open(Screen.Orange)
    }

    fun openYellow() {
        mLocalCicerone.open(Screen.Yellow)
    }

    fun openGreen() {
        mLocalCicerone.open(Screen.Green)
    }

    fun openLightBlue() {
        mLocalCicerone.open(Screen.LightBlue)
    }

}
