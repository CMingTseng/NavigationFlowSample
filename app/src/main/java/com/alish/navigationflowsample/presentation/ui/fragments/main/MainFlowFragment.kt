package com.alish.navigationflowsample.presentation.ui.fragments.main

import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.alish.navigationflowsample.R
import com.alish.navigationflowsample.databinding.FlowFragmentMainBinding
import com.alish.navigationflowsample.presentation.base.BaseFlowFragment

class MainFlowFragment : BaseFlowFragment(
    R.layout.flow_fragment_main, R.id.nav_host_fragment_main
) {
    private val binding by viewBinding(FlowFragmentMainBinding::bind)
    override fun setupNavigation() {
        binding.toolbar.setupWithNavController(
            navController, AppBarConfiguration(navController.graph)
        )
    }
}