package com.example.roomapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.roomapp.domain.models.Heroe
import kotlinx.coroutines.flow.Flow


@Dao
interface HeroeDao {
    @Query("SELECT * FROM heroe")
    fun getAllHeroes(): Flow<List<Heroe>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(heroes: List<Heroe>)

}