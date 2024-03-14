package com.example.heroesapp.ui

import android.os.Bundle
import android.util.Log
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
        Log.i("DetailActivity", "ID del héroe recibido: $heroeId")
        val heroe = Heroe.heroes.find { it.id == heroeId }
        if (heroe != null) {
            Log.i("DetailActivity", "Héroe encontrado: ${heroe.name}")
        } else {
            Log.e("DetailActivity", "No se encontró ningún héroe con el ID proporcionado")
        }

        txtHeroeName.text = heroe?.name
        txtHeroeDescription.text = heroe?.description
        Picasso.get().load(heroe?.image ?: R.drawable.superhero1).into(imgHeroe)
    }
}