package com.savitrisekar.jogjatasty

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.jogjatasty.R
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_foodie.view.*

class FoodAdapter(private val listFood: ArrayList<Food>) :
    RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivFood: ImageView = itemView.findViewById(R.id.iv_food)
        var tvFoodName: TextView = itemView.findViewById(R.id.tv_title_food)
        var tvFoodTag: TextView = itemView.findViewById(R.id.tv_title_tag)
        var tvFoodArea: TextView = itemView.findViewById(R.id.tv_title_area)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_foodie, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val food = listFood[position]
        Glide.with(holder.itemView.context)
            .load(food.image)
            .apply(RequestOptions())
            .into(holder.ivFood)

        holder.tvFoodName.text = food.name
        holder.tvFoodTag.text = food.tags
        holder.tvFoodArea.text = food.area

        val mContext = holder.itemView.context
        holder.itemView.setOnClickListener {
            val foodDetail = Intent(mContext, DetileFoodActivity::class.java)
            foodDetail.putExtra(DetileFoodActivity.EXTRA_IMAGE, food.image)
            foodDetail.putExtra(DetileFoodActivity.EXTRA_NAME, food.name)
            foodDetail.putExtra(DetileFoodActivity.EXTRA_CATEGORY, food.category)
            foodDetail.putExtra(DetileFoodActivity.EXTRA_AREA, food.area)
            foodDetail.putExtra(DetileFoodActivity.EXTRA_INGREDIENTS, food.ingredients)
            foodDetail.putExtra(DetileFoodActivity.EXTRA_INSTRUCTION, food.instructions)
            mContext.startActivity(foodDetail)
        }
    }
}