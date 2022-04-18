package com.ko.rickmorty.data.repository.datasource

import com.ko.rickmorty.data.model.CartoonCharacter

interface CartoonCharacterLocalDataSource {
    suspend fun getCartoonCharactersFromDatabase(): List<CartoonCharacter>
    suspend fun saveCartoonCharactersToDatabase(cartoonCharacters: List<CartoonCharacter>)
    suspend fun clearAll()
}