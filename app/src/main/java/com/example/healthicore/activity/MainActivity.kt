package com.example.healthicore.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.healthicore.R
import com.example.healthicore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView)
        val navController = navHostFragment?.findNavController()
        val bottomNavigationView = binding.bottomNavigationView

        NavigationUI.setupWithNavController(bottomNavigationView, navController!!)

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.statisticsFragment -> {
                    navController.navigate(R.id.statisticsFragment)
                    true
                }

                R.id.settingsFragment -> {
                    navController.navigate(R.id.settingsFragment)
                    true
                }

                else -> false
            }
        }
    }
}
