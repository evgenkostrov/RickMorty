package com.ko.rickmorty.ui.cartooncharacter

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ko.rickmorty.domain.usecase.GetCartoonCharacterUseCase
import com.ko.rickmorty.domain.usecase.UpdateCartoonCharacterUseCase

class CartoonCharacterViewModelFactory(
    private val getCartoonCharacterUseCase: GetCartoonCharacterUseCase,
    private val updateCartoonCharacterUseCase: UpdateCartoonCharacterUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CartoonCharacterViewModel::class.java)) {
            return CartoonCharacterViewModel(getCartoonCharacterUseCase, updateCartoonCharacterUseCase) as T
        }

        throw IllegalArgumentException("Cannot create view model for ${modelClass.name}")
    }
}