package com.example.frigy.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.frigy.R
import com.example.frigy.databinding.ActivityMainBinding
import com.example.frigy.databinding.FragmentFridgeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class FridgeFragment : Fragment() {

    private var binding: FragmentFridgeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fridge, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


}