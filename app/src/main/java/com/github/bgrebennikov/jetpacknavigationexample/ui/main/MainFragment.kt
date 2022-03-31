package com.github.bgrebennikov.jetpacknavigationexample.ui.main

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import androidx.navigation.ui.NavigationUI
import com.github.bgrebennikov.jetpacknavigationexample.R
import com.github.bgrebennikov.jetpacknavigationexample.databinding.FragmentMainBinding
import com.github.bgrebennikov.jetpacknavigationexample.ui.base.BaseFragment

class MainFragment : BaseFragment<FragmentMainBinding>(
    FragmentMainBinding::inflate
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (savedInstanceState == null) initNavHost()

    }

    private fun initNavHost(){
        val navHost = childFragmentManager
            .findFragmentById(R.id.container_main)
                as NavHostFragment
        val navController = navHost.navController

        val bottomNav = binding.bottomNavView.apply {
            setOnItemReselectedListener {
                navController.navigate(it.itemId, null, navOptions{
                    popUpTo(it.itemId){
                        inclusive = true
                    }
                })
            }
        }

        NavigationUI.setupWithNavController(
            bottomNav,
            navController
        )
    }


}