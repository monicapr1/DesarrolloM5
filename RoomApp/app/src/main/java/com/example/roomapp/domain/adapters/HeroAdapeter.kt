package com.example.roomapp.domain.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.roomapp.R
import com.example.roomapp.domain.models.Heroe
import com.squareup.picasso.Picasso

class HeroAdapeter (val heroes: List<Heroe>) : RecyclerView.Adapter<HeroAdapeter.ViewHolder>() {
    class ViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        val name = item.findViewById<TextView>(R.id.heroe_name)
        val image = item.findViewById<ImageView>(R.id.heroe_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.heroes_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val heroe = heroes[position]
        holder.name.text = heroe.name
        Picasso.get().load(heroe.image).into(holder.image)

    }
}