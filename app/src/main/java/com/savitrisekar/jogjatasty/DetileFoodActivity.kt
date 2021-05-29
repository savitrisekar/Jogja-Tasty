package com.savitrisekar.jogjatasty

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.jogjatasty.R
import kotlinx.android.synthetic.main.activity_detile_food.*
import kotlinx.android.synthetic.main.item_category_new.*

class DetileFoodActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_CATEGORY = "extra_category"
        const val EXTRA_AREA = "extra_area"
        const val EXTRA_INSTRUCTION = "extra_instruction"
        const val EXTRA_INGREDIENTS = "extra_ingredients"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detile_food)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.apply {
            setHomeAsUpIndicator(R.drawable.ic_back)
            setDisplayHomeAsUpEnabled(true)
        }

        val civFood: ImageView = findViewById(R.id.iv_foodie)
        val tvCategory: TextView = findViewById(R.id.tv_category)
        val tvArea: TextView = findViewById(R.id.tv_country)
        val tvInstruction: TextView = findViewById(R.id.tv_instruction)
        val tvIngredients: TextView = findViewById(R.id.tv_ingredient)

        val image = intent.getIntExtra(EXTRA_IMAGE, 0)
        val name = intent.getStringExtra(EXTRA_NAME)
        val category = intent.getStringExtra(EXTRA_CATEGORY)
        val area = intent.getStringExtra(EXTRA_AREA)
        val instruction = intent.getStringExtra(EXTRA_INSTRUCTION)
        val ingredient = intent.getStringExtra(EXTRA_INGREDIENTS)

        Glide.with(this)
            .load(image)
            .apply(RequestOptions())
            .into(civFood)

        tvCategory.text = category
        tvArea.text = area
        tvInstruction.text = instruction
        tvIngredients.text = ingredient

        supportActionBar?.title = name
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}