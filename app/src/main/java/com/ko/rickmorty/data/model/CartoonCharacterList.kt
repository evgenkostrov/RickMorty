package com.ko.rickmorty.data.model


import com.google.gson.annotations.SerializedName

data class CartoonCharacterList(
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val cartoonCharacters: List<CartoonCharacter>
)