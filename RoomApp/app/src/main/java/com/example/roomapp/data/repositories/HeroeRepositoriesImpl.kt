package com.example.roomapp.data.repositories

import com.example.roomapp.data.dao.HeroeDao
import com.example.roomapp.domain.models.Heroe
import com.example.roomapp.domain.repositories.HeroeRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class HeroeRepositoriesImpl @Inject constructor (
    private val heroeDao : HeroeDao
) : HeroeRepository {
    override suspend fun getAllHeroes(): Flow<List<Heroe>> {
        return heroeDao.getAllHeroes()
    }
}