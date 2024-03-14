package com.example.heroesapp.ui

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.heroesapp.R
import com.example.heroesapp.models.Heroe
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso


class DetailActivity : AppCompatActivity() {
    private lateinit var txtHeroeName: TextView
    private lateinit var txtHeroeDescription: TextView
    private lateinit var imgHeroe: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.heroe_detail)

        txtHeroeName = findViewById(R.id.txtHeroeName)
        txtHeroeDescription = findViewById(R.id.txtHeroeDescription)
        imgHeroe = findViewById(R.id.imageViewHeroe)

        val heroeId = intent.getIntExtra("heroeId", 0)
        val heroe = Heroe.heroes.find { it.id == heroeId }
        txtHeroeName.text = heroe?.name
        txtHeroeDescription.text = heroe?.description
        Picasso.get().load(heroe?.image ?: R.drawable.sh14).into(imgHeroe)
    }
}