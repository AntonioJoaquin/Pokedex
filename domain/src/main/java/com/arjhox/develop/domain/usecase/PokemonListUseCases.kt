package com.arjhox.develop.domain.usecase

import com.arjhox.develop.domain.repository.PokemonListRepository

class PokemonListUseCases(
    private val pokemonListRepository: PokemonListRepository
) {

    fun getAllPokemonList() = pokemonListRepository.getAllPokemonList()

}