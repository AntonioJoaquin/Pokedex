package com.arjhox.develop.domain

import com.arjhox.develop.domain.repository.PokemonListRepository
import com.arjhox.develop.domain.usecase.PokemonListUseCases
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import org.junit.Before
import org.junit.Test

class PokemonListUseCasesTest {

    private lateinit var pokemonListRepository: PokemonListRepository
    private lateinit var pokemonListUseCases: PokemonListUseCases


    @Before
    fun setUp() {
        this.pokemonListRepository = mock()
        this.pokemonListUseCases = PokemonListUseCases(pokemonListRepository)
    }


    @Test
    fun `getAllPokemonList from use case should call getAllPokemonList from pokemonListRepository`() {
        pokemonListUseCases.getAllPokemonList()

        verify(pokemonListRepository).getAllPokemonList()
    }

}