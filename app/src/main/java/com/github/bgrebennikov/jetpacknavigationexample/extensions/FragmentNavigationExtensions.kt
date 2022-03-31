package com.github.bgrebennikov.jetpacknavigationexample.extensions

import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.github.bgrebennikov.jetpacknavigationexample.R


fun Fragment.findRootNavController() : NavController{

    val rootHost =
        requireActivity().supportFragmentManager
            .findFragmentById(R.id.container_root) as NavHostFragment?

    return rootHost?.navController ?: findNavController()

}