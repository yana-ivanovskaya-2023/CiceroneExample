package com.example.feature_one

import android.graphics.Color
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment


class EdgeToEdgeState {

    private var mOriginalStatusBarColor = Color.TRANSPARENT

    fun set(fragment: Fragment) {
        with(fragment) {
            val view = view ?: return

            mOriginalStatusBarColor = requireActivity().window.statusBarColor
            requireActivity().window.statusBarColor = Color.TRANSPARENT
            WindowCompat.setDecorFitsSystemWindows(requireActivity().window, false)
            ViewCompat.setOnApplyWindowInsetsListener(view) { _, _ ->

                WindowInsetsCompat.CONSUMED
            }
        }
    }

    fun reset(fragment: Fragment) {
        with(fragment) {
            val view = view ?: return

            requireActivity().window.statusBarColor = mOriginalStatusBarColor
            WindowCompat.setDecorFitsSystemWindows(requireActivity().window, true)
            ViewCompat.setOnApplyWindowInsetsListener(view, null)
        }
    }

}