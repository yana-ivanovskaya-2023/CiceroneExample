package com.example.ciceroneexample.navigation

import javax.inject.Inject


/**
 * Пример навигации через интерфейс, по аналогии с тем, как сейчас работает
 *
 * Код в фичевых модулях не должен знать больше чем использует
 *
 */
interface ILightBlueNavigator {
    fun openDarkBlue()
    fun openPurple()
}


class LightBlueNavigator @Inject constructor(
    private val rootNavigatorProvider: RootNavigatorProvider
) : ILightBlueNavigator {

    override fun openDarkBlue() {
        rootNavigatorProvider.open(Screen.DarkBlue)
    }

    override fun openPurple() {
        rootNavigatorProvider.open(Screen.Purple)
    }

}