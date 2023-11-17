package com.example.ciceroneexample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.ciceroneexample.databinding.FragmentMainMenuBinding
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.androidx.AppNavigator
import javax.inject.Inject


class MainMenuFragment : Fragment(R.layout.fragment_main_menu) {

    @Inject
    lateinit var navigator: IAppNavigator

//    @Inject
//    lateinit var navigatorHolder: NavigatorHolder

    private val mBinding by viewBindings(FragmentMainMenuBinding::bind)
//    private val mNavigator
//        get() = AppNavigator(requireActivity(), R.id.mainMenuRoot)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        IAppComponent.get().inject(this)
        setOnBackPressedListener {
            println("BACK!")
        }
       // println("navigatorHolder $navigatorHolder")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(mBinding) {
            bottomNavigationView.setOnItemSelectedListener { menuItem ->
                val item = MainMenuItem.entries.firstOrNull { it.id == menuItem.itemId }
                    ?: return@setOnItemSelectedListener false

                when (item) {
                    MainMenuItem.RED -> navigator.openScreen(Screen.Red)
                    MainMenuItem.ORANGE -> navigator.openScreen(Screen.Orange)
                    MainMenuItem.YELLOW -> navigator.openScreen(Screen.Yellow)
                    MainMenuItem.GREEN -> navigator.openScreen(Screen.Green)
                    MainMenuItem.LIGHT_BLUE -> navigator.openScreen(Screen.LightBlue)
                }

                return@setOnItemSelectedListener true
            }
            bottomNavigationView.selectedItemId = R.id.red
        }
    }

    override fun onResume() {
        super.onResume()
//        navigatorHolder.setNavigator(mNavigator)
    }

    override fun onPause() {
//        navigatorHolder.removeNavigator()
        super.onPause()
    }

}