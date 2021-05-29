package com.savitrisekar.jogjatasty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.jogjatasty.R
import kotlinx.android.synthetic.main.activity_categories.*

class MainActivity : AppCompatActivity() {

    private var listFood: ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        rv_category.setHasFixedSize(true)
        listFood.addAll(FoodData.listFoodData)

        initView()
        showRecycler()
    }

    private fun initView() {

        civ_about.setOnClickListener {
            val intent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intent)
        }
    }

    private fun showRecycler() {

        rv_category.layoutManager = LinearLayoutManager(this)
        val foodAdapter = FoodAdapter(listFood)
        rv_category.adapter = foodAdapter
    }
}