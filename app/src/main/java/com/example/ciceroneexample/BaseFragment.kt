package com.example.ciceroneexample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

open class BaseFragment : Fragment(R.layout.fragment_template) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("VIEW CREATED $this")
    }

    override fun onDestroyView() {
        println("VIEW DESTROYED $this")
        super.onDestroyView()
    }

    override fun onResume() {
        super.onResume()
        println("RESUME $this")
    }

    override fun onPause() {
        super.onPause()
        println("PAUSE $this")
    }

}
