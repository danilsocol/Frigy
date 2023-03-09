package com.example.frigy.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.frigy.R
import com.example.frigy.databinding.FragmentShopCartBinding

class ShopCartFragment : Fragment() {

    private var binding: FragmentShopCartBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_shop_cart, container, false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}