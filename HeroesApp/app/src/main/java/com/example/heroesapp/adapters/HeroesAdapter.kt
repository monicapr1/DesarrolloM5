package com.example.heroesapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.heroesapp.R
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.models.Heroe
import com.squareup.picasso.Picasso


class HeroesAdapter(val heroes: List<Heroe>, val onClick:(Heroe) -> Unit) : RecyclerView.Adapter<HeroesAdapter.HeroesViewHolder>() {

    class HeroesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val heroImageView: ImageView = view.findViewById(R.id.heroe_image)
        val heroNameTextView: TextView = view.findViewById(R.id.heroe_name)
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
            Picasso.get().load(hero.image).into(holder.heroImageView)
            holder.itemView.setOnClickListener {
                onClick(hero)
            }
        }
    }
