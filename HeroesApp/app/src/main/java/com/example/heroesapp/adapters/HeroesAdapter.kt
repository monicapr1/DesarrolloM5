package com.example.heroesapp.adapters

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.models.Heroe
import com.squareup.picasso.Picasso

class HeroesAdapter(val heroes: List<Heroe>, val onClick:(Heroe) -> Unit) : RecyclerView.Adapter<HeroesAdapter.HeroesViewHolder>() {

    class HeroesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val heroImageView: ImageView = view.findViewById(R.id.heroe_image)
        val heroNameTextView: TextView = view.findViewById(R.id.heroe_name)
        val frameLayout: FrameLayout = view.findViewById(R.id.hero_frame_layout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.heroes_item, parent, false)
        return HeroesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroes.size
    }

    override fun onBindViewHolder(holder: HeroesViewHolder, position: Int) {
        val hero = heroes[position]
        holder.heroNameTextView.text = hero.name
        if (hero.itemId == 1) {
            // DC

            holder.heroNameTextView.setTextColor(Color.parseColor("#0078D4"))
            holder.frameLayout.setBackgroundResource(R.drawable.circle_background_dc)
        } else {
            // Marvel
            holder.heroNameTextView.setTextColor(Color.parseColor("#FF0000"))
            holder.frameLayout.setBackgroundResource(R.drawable.circle_background_marvel)
        }
        Picasso.get().load(hero.image).into(holder.heroImageView)
        holder.itemView.setOnClickListener {
            onClick(hero)
        }
    }
}
