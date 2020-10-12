package com.arjhox.develop.domain.repository

import com.arjhox.develop.domain.model.PokemonItem
import kotlinx.coroutines.flow.Flow

interface PokemonListRepository {

    fun getAllPokemonList(): Flow<List<PokemonItem>>

}