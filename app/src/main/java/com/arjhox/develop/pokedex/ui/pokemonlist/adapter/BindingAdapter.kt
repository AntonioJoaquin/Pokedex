package com.arjhox.develop.pokedex.ui.pokemonlist.adapter

import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imagePath")
fun AppCompatImageView.setImagePath(path: String) {
    Glide.with(this)
        .load(path)
        .into(this)
}