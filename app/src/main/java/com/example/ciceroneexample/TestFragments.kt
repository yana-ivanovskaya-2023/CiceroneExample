package com.example.ciceroneexample

import android.graphics.Color
import android.os.Bundle
import android.view.View
import com.example.ciceroneexample.databinding.FragmentMoreMenuBinding
import com.example.ciceroneexample.di.AppDi
import com.example.ciceroneexample.navigation.LightBlueNavigator
import javax.inject.Inject


class RedFragment : BaseFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.setBackgroundColor(Color.RED)
    }
}

class OrangeFragment : BaseFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.setBackgroundColor(Color.parseColor("#FF6600"))
    }
}

class YellowFragment : BaseFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.setBackgroundColor(Color.YELLOW)
    }
}

class GreenFragment : BaseFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.setBackgroundColor(Color.GREEN)
    }
}

class LightBlueFragment : BaseFragment(R.layout.fragment_more_menu) {

    @Inject
    lateinit var navigator: LightBlueNavigator

    private val mBinding by viewBindings(FragmentMoreMenuBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppDi.get().inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.setBackgroundColor(Color.parseColor("#add8e6"))

        with(mBinding) {
            darkBlue.setOnClickListener {
                navigator.openDarkBlue()
            }

            purple.setOnClickListener {
                navigator.openPurple()
            }

            featureOne.setOnClickListener {
                navigator.openFeatureOne("HELLO EVERYBODY")
            }
        }
    }

}


class DarkBlueFragment : BaseFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.setBackgroundColor(Color.BLUE)
    }
}

class PurpleFragment : BaseFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.setBackgroundColor(Color.parseColor("#6A0DAD"))
    }

}