package com.ko.rickmorty.data.repository.datasource

import com.ko.rickmorty.data.model.CartoonCharacter

interface CartoonCharacterCacheDataSource {
    suspend fun getCartoonCharactersFromCache(): List<CartoonCharacter>
    suspend fun saveCartoonCharactersToCache(cartoonCharacters: List<CartoonCharacter>)
}