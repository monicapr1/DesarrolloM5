package com.example.roomapp.domain.models

import android.media.Image
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "heroe")

data class Heroe(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val name :String,
    val image: String
){
    companion object{
        val heroes = listOf<Heroe>(
            Heroe(1, "SpiderMan","https://images.unsplash.com/photo-1600480505021-e9cfb05527f1?q=80&w=3532&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"),
            Heroe(2,"SpiderMan2", "https://cdn-3.expansion.mx/dims4/default/e285416/2147483647/resize/1280x/quality/90/?url=https%3A%2F%2Fcherry-brightspot.s3.amazonaws.com%2F91%2Fc3%2F604520b24bc7a7ea61497b4dac7b%2Fspider-man-homecoming.0.jpg"),
            Heroe(3, "SpiderMan3","https://cdn-3.expansion.mx/dims4/default/e285416/2147483647/resize/1280x/quality/90/?url=https%3A%2F%2Fcherry-brightspot.s3.amazonaws.com%2F91%2Fc3%2F604520b24bc7a7ea61497b4dac7b%2Fspider-man-homecoming.0.jpg"),
          )
    }
}


