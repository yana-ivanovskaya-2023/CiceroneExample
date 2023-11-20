package com.example.feature_one

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

class FeatureOneFragment : Fragment(R.layout.fragment_feature_one) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView).text = arguments?.getString(ARG_1)
    }

    companion object {

        private const val ARG_1 = "args1"

        fun newInstance(arg: String) = FeatureOneFragment().apply {
            arguments = Bundle().apply {
                putString(ARG_1, arg)
            }
        }
    }

}