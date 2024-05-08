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
            Heroe(1, "SpiderMan","https://cdn-3.expansion.mx/dims4/default/e285416/2147483647/resize/1280x/quality/90/?url=https%3A%2F%2Fcherry-brightspot.s3.amazonaws.com%2F91%2Fc3%2F604520b24bc7a7ea61497b4dac7b%2Fspider-man-homecoming.0.jpg"),
            Heroe(2,"SpiderMan2", "https://cdn-3.expansion.mx/dims4/default/e285416/2147483647/resize/1280x/quality/90/?url=https%3A%2F%2Fcherry-brightspot.s3.amazonaws.com%2F91%2Fc3%2F604520b24bc7a7ea61497b4dac7b%2Fspider-man-homecoming.0.jpg"),
            Heroe(3, "SpiderMan3","https://cdn-3.expansion.mx/dims4/default/e285416/2147483647/resize/1280x/quality/90/?url=https%3A%2F%2Fcherry-brightspot.s3.amazonaws.com%2F91%2Fc3%2F604520b24bc7a7ea61497b4dac7b%2Fspider-man-homecoming.0.jpg"),
        )
    }
}


