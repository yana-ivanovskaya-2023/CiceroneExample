package com.example.ciceroneexample

import androidx.annotation.IdRes

enum class MainMenuItem(@IdRes val id: Int) {
    RED(R.id.red),
    ORANGE(R.id.orange),
    YELLOW(R.id.yellow),
    GREEN(R.id.green),
    LIGHT_BLUE(R.id.lightBlue)
}