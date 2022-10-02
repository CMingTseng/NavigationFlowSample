package com.alish.navigationflowsample.presentation.ui.fragments.main.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.alish.navigationflowsample.R
import com.alish.navigationflowsample.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home){
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding =FragmentHomeBinding.bind(view)
        binding.info.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_detail)
        }

        binding.create.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_create)
        }
    }
}