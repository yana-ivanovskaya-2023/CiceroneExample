package com.example.ciceroneexample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.ciceroneexample.databinding.FragmentMainMenuBinding
import com.example.ciceroneexample.di.AppDi
import com.example.ciceroneexample.navigation.AppNavigatorFragmentAdapter
import com.example.ciceroneexample.navigation.IMainMenuNavigatorFactory
import javax.inject.Inject


class MainMenuFragment : Fragment(R.layout.fragment_main_menu) {

    @Inject
    lateinit var mainMenuNavigatorFactory: IMainMenuNavigatorFactory
    private val mNavigator
        get() = mainMenuNavigatorFactory.get(AppNavigatorFragmentAdapter(this, R.id.mainMenuRoot))

    private val mBinding by viewBindings(FragmentMainMenuBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppDi.get().inject(this)
        setOnBackPressedListener {
            println("BACK!")
            // handle by viewmodel
        }
        println("MainMenuFragment onCreate")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        println("MainMenuFragment onViewCreated")
        with(mBinding) {
            bottomNavigationView.setOnItemSelectedListener { menuItem ->
                val item = MainMenuItem.entries.firstOrNull { it.id == menuItem.itemId }
                    ?: return@setOnItemSelectedListener false

                when (item) {
                    MainMenuItem.RED -> mNavigator.openRed()
                    MainMenuItem.ORANGE -> mNavigator.openOrange()
                    MainMenuItem.YELLOW -> mNavigator.openYellow()
                    MainMenuItem.GREEN -> mNavigator.openGreen()
                    MainMenuItem.LIGHT_BLUE -> mNavigator.openLightBlue()
                }

                return@setOnItemSelectedListener true
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("MainMenuFragment onDestroyView")
    }
    override fun onDestroy() {
        super.onDestroy()
        println("MainMenuFragment onDestroy")
    }

    override fun onResume() {
        super.onResume()
        mNavigator.attach()
    }

    override fun onPause() {
        mNavigator.detach()
        super.onPause()
    }

}