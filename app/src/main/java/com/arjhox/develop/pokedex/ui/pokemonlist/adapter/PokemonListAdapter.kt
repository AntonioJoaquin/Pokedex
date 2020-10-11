package com.arjhox.develop.pokedex.ui.pokemonlist.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arjhox.develop.pokedex.R
import com.arjhox.develop.pokedex.databinding.ItemPokemonBinding
import com.arjhox.develop.pokedex.extension.bindingInflate
import com.arjhox.develop.pokedex.model.PokemonItem

class PokemonListAdapter: RecyclerView.Adapter<PokemonListViewHolder>() {

    var items = listOf<PokemonItem>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonListViewHolder =
        PokemonListViewHolder.from(parent)

    override fun getItemCount(): Int =
        items.size

    override fun onBindViewHolder(holder: PokemonListViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

}


class PokemonListViewHolder(
    private val binding: ItemPokemonBinding
): RecyclerView.ViewHolder(binding.root) {

    companion object {
        fun from(parent: ViewGroup): PokemonListViewHolder {
            val binding = parent.bindingInflate<ItemPokemonBinding>(R.layout.item_pokemon)

            return PokemonListViewHolder(binding)
        }
    }


    fun bind(pokemonItem: PokemonItem) {
        binding.pokemon = pokemonItem

        binding.executePendingBindings()
    }

}