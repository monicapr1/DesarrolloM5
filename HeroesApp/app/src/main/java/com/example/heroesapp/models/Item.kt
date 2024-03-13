package com.example.heroesapp.models

import com.example.heroesapp.R

data class Item(val id:Int, val name: String, val image: Int){
    companion object{
        val items = mutableListOf<Item>(
            Item(1, "DC", R.drawable.dc),
            Item(2, "Marvel", R.drawable.marvel)
        )
    }
}
