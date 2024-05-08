package com.example.roomapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.roomapp.data.dao.HeroeDao
import com.example.roomapp.domain.models.Heroe

@Database(entities = [Heroe::class], version = 1)
abstract class HeroeDB : RoomDatabase() {
    abstract fun heroeDao():HeroeDao
}