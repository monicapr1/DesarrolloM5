package com.example.roomapp.domain.use_cases

import com.example.roomapp.domain.models.Heroe
import com.example.roomapp.domain.repositories.HeroeRepository
import kotlinx.coroutines.flow.Flow

class GetHeroe (private val repository: HeroeRepository)  {
    suspend operator fun invoke(): Flow<List<Heroe>> {
        return repository.getAllHeroes()
    }
}