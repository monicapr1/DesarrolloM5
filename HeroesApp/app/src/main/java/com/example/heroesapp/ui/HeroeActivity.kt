package com.example.heroesapp.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.adapters.HeroesAdapter
import com.example.heroesapp.models.Item
import com.example.heroesapp.models.Heroe

class HeroeActivity : AppCompatActivity() {
    private lateinit var heroesRecyclerView: RecyclerView
    private lateinit var txtHeroes: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heroes)

        val itemId = intent.getIntExtra("itemId", 0)
        val heroesMostrar = Heroe.heroes.filter { it.itemId == itemId }
        Log.i("HeroeActivity", "heroesMostrar: $heroesMostrar")

        txtHeroes = findViewById(R.id.txtHeroes)
        val item = Item.items.find { it.id == itemId }
        txtHeroes.text = item?.name

        heroesRecyclerView = findViewById(R.id.heroes_recycler_view)
        heroesRecyclerView.adapter = HeroesAdapter(heroesMostrar) { heroe ->
            Log.i("HeroeActivity", "ID del héroe seleccionado: ${heroe.id}")
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("heroeId", heroe.id)
            }
            startActivity(intent)
        }
        heroesRecyclerView.layoutManager = GridLayoutManager(this, 2)
        val sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE)
    }
}
