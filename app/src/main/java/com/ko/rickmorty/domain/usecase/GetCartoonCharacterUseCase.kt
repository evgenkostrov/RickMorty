package com.ko.rickmorty.domain.usecase

import com.ko.rickmorty.data.model.CartoonCharacter
import com.ko.rickmorty.domain.repository.CartoonCharacterRepository

class GetCartoonCharacterUseCase(
    private val cartoonCharacterRepository: CartoonCharacterRepository
    ) {
    suspend fun execute(page: Int = 1): List<CartoonCharacter>? =
        cartoonCharacterRepository.getCartoonCharacters(page)
}