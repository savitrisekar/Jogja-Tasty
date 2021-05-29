package com.savitrisekar.jogjatasty

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.jogjatasty.R
import kotlinx.android.synthetic.main.activity_detile_food.*

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

        initView()
    }

    private fun initView() {

        val image = intent.getIntExtra(EXTRA_IMAGE, 0)
        val name = intent.getStringExtra(EXTRA_NAME)
        val category = intent.getStringExtra(EXTRA_CATEGORY)
        val area = intent.getStringExtra(EXTRA_AREA)
        val instruction = intent.getStringExtra(EXTRA_INSTRUCTION)
        val ingredient = intent.getStringExtra(EXTRA_INGREDIENTS)

        Glide.with(this)
            .load(image)
            .apply(RequestOptions())
            .into(iv_foodie)

        tv_title_food.text = name
        tv_category.text = category
        tv_country.text = area
        tv_instruction.text = instruction
        tv_ingredient.text = ingredient

        fab_share.setOnClickListener {
            val message = "Ingredients of $name\n\n$ingredient"
            //Intent to share the text
            val shared = Intent()
            shared.action = Intent.ACTION_SEND
            shared.type = "text/plain"
            shared.putExtra(Intent.EXTRA_TEXT, message);
            startActivity(Intent.createChooser(shared, "Share via"))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}