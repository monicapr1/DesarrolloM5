package com.example.heroesapp.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.R
import com.example.heroesapp.adapters.HeroesAdapter
import com.example.heroesapp.models.Item
import com.example.heroesapp.models.Heroe

class HeroeActivity : AppCompatActivity() {
    private lateinit var HeroesRecyclerView: RecyclerView
    private lateinit var txtHeroes: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heroes)

        val publisherId = intent.getIntExtra("itemId", 0)
        val heroesMostrar = Heroe.heroes.filter { it.itemId == publisherId }
        txtHeroes = findViewById(R.id.txtHeroes)
        val publisher = Item.items.find { it.id == publisherId }
        txtHeroes.text = publisher?.name


        Log.i("Heroes", heroesMostrar.toString())



        HeroesRecyclerView = findViewById(R.id.heroes_recycler_view)
        HeroesRecyclerView.adapter = HeroesAdapter(heroesMostrar) { heroe ->
            val intent = Intent(this, HeroeActivity::class.java).apply {
                putExtra("heroeId", heroe.id)
            }
            startActivity(intent)


        }
        HeroesRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        HeroesRecyclerView.layoutManager = GridLayoutManager(this,2)
        val sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE)
    }
}