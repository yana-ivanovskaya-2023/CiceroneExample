package com.example.ciceroneexample

import com.github.terrakok.cicerone.androidx.FragmentScreen

sealed interface Screen {

    val value: FragmentScreen

    data class Main(val some: Int) : Screen {
        override val value = FragmentScreen { MainMenuFragment() }
    }

    data object Red : Screen {
        override val value = FragmentScreen { RedFragment() }
    }

    data object Orange : Screen {
        override val value = FragmentScreen { OrangeFragment() }
    }

    data object Yellow : Screen {
        override val value = FragmentScreen { YellowFragment() }
    }

    data object Green : Screen {
        override val value = FragmentScreen { GreenFragment() }
    }

    data object LightBlue : Screen {
        override val value = FragmentScreen { LightBlueFragment() }
    }

}


