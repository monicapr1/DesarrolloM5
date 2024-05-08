package com.example.roomapp.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.roomapp.R
import com.example.roomapp.domain.adapters.HeroAdapeter
import com.example.roomapp.domain.models.Heroe
import com.example.roomapp.presentation.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var heroeRecicleView: RecyclerView
    private val superheroes = mutableListOf<Heroe>()
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        heroeRecicleView = findViewById(R.id.heroes_recycler_view)
        observeState()

    }

    private fun observeState() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                mainViewModel.state.collect {
                    Log.i("Heroe: ", superheroes.toString())
                    heroeRecicleView = findViewById(R.id.heroes_recycler_view)
                    heroeRecicleView.adapter = HeroAdapeter(it.heroes)
                    heroeRecicleView.layoutManager = GridLayoutManager(this@MainActivity, 2)
                }
            }
        }
    }

}