package com.github.bgrebennikov.jetpacknavigationexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.github.bgrebennikov.jetpacknavigationexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        if(savedInstanceState == null) initMainFragmentContainer()

    }

//    private fun initMainFragmentContainer(){
//        val navHost = supportFragmentManager.findFragmentById(R.id.container_main) as NavHostFragment
//        val navController = navHost.navController
//
//        NavigationUI.setupWithNavController(binding.bottomNavView, navController)
//
//    }

}