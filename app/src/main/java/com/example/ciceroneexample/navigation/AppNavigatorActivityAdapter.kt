package com.example.ciceroneexample.navigation

import androidx.appcompat.app.AppCompatActivity
import com.github.terrakok.cicerone.androidx.AppNavigator

class AppNavigatorActivityAdapter(
    private val activity: AppCompatActivity
) {

    internal val navigator: AppNavigator by lazy {
        AppNavigator(
            activity,
            android.R.id.content,
            activity.supportFragmentManager
        )
    }

}