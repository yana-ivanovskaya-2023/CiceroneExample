package com.example.ciceroneexample.navigation

import com.example.ciceroneexample.DarkBlueFragment
import com.example.ciceroneexample.GreenFragment
import com.example.ciceroneexample.LightBlueFragment
import com.example.ciceroneexample.MainMenuFragment
import com.example.ciceroneexample.OrangeFragment
import com.example.ciceroneexample.PurpleFragment
import com.example.ciceroneexample.RedFragment
import com.example.ciceroneexample.YellowFragment
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

    data object DarkBlue : Screen {
        override val value = FragmentScreen { DarkBlueFragment() }
    }

    data object Purple : Screen {
        override val value = FragmentScreen { PurpleFragment() }
    }

}


