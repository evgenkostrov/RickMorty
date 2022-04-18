package com.ko.rickmorty.domain.repository

import com.ko.rickmorty.data.model.CartoonCharacter

interface CartoonCharacterRepository {
    suspend fun getCartoonCharacters(page: Int): List<CartoonCharacter>?
    suspend fun updateCartoonCharacters(page: Int): List<CartoonCharacter>?
}