package com.example.ciceroneexample.navigation

import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

/**
 * Реализация навигации фрагментов внутри активити
 */

@AssistedFactory
interface IRootNavigatorFactory {
    fun get(appNavigator: AppNavigatorActivityAdapter): RootNavigator
}

class RootNavigator @AssistedInject constructor(
    storage: LocalCiceroneStorage,
    @Assisted private val appNavigator: AppNavigatorActivityAdapter
) {

    private val mLocalCicerone = storage.getCicerone(Holder.ROOT)

    fun attach() {
        mLocalCicerone.getNavigatorHolder().setNavigator(appNavigator.navigator)
    }

    fun detach() {
        mLocalCicerone.getNavigatorHolder().removeNavigator()
    }

    fun openMainMenu() {
        mLocalCicerone.open(Screen.Main(0))
    }

}