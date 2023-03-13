package com.example.frigy.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.frigy.R
import com.example.frigy.databinding.FragmentAllFoodBinding
import com.example.frigy.databinding.ItemRcViewAllFoodBinding

class FoodAdapter : RecyclerView.Adapter<FoodAdapter.FoodHolder>(){

    val foodList: ArrayList<FoodData> = arrayListOf(
        FoodData( R.drawable.liquid,"Жидкость","Молоко",true,1,"Литров"),
        FoodData( R.drawable.liquid,"Жидкость","Молоко",true,1,"Литров"),
        FoodData( R.drawable.liquid,"Жидкость","Молоко",true,1,"Литров"),
        FoodData( R.drawable.liquid,"Жидкость","Молоко",true,1,"Литров"),

    )

    inner class FoodHolder(item: View): RecyclerView.ViewHolder(item){
        val binding = ItemRcViewAllFoodBinding.bind(item)

        fun bind(foodData: FoodData) = with(binding){
            iconFoodCategory.setImageResource(foodData.iconId)
            nameFood.text = foodData.name
            checkBoxImportant.isChecked = foodData.important
            maxQuantityEdit.setText(foodData.maxQuantityEdit)
            unit.text = foodData.unit

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rc_view_all_food,parent,false)
        return FoodHolder(view)
    }

    override fun onBindViewHolder(holder: FoodHolder, position: Int) {
        holder.bind(foodList[position])
    }

    override fun getItemCount(): Int {
        return foodList.size
    }
}