package com.example.ciceroneexample.navigation

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import com.github.terrakok.cicerone.androidx.AppNavigator

class AppNavigatorFragmentAdapter(
    private val fragment: Fragment,
    @IdRes private val containerId: Int
)  {

     internal val navigator: AppNavigator by lazy {
        AppNavigator(
            fragment.requireActivity(),
            containerId,
            fragment.childFragmentManager
        )
    }

}

