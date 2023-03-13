package com.example.frigy.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.frigy.R
import com.example.frigy.databinding.FragmentAllFoodBinding

class AllFoodFragment : Fragment() {

    private var binding: FragmentAllFoodBinding? = null
    private val foodAdapter = FoodAdapter()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.apply{
            binding?.rcViewAllFood?.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
            binding?.rcViewAllFood?.adapter = foodAdapter
        }
        return inflater.inflate(R.layout.fragment_all_food, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}