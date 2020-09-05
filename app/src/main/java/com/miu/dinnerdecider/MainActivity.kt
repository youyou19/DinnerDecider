package com.miu.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.random
import java.util.*

class MainActivity : AppCompatActivity() {

val foodList =arrayListOf("Hanburger","Pizza","Mexican","American","Chinese")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        decideBtn.setOnClickListener {
         val random= Random()
        val randomFood =random.nextInt(foodList.count())
        selectedFood.text= foodList[randomFood]
    }
    addFoodBtn.setOnClickListener{
        val newFood=addFoodtxt.text.toString()
        if(!foodList.contains(newFood))
            foodList.add(newFood)
            addFoodtxt.text.clear()
           println(foodList)
    }

    }


}