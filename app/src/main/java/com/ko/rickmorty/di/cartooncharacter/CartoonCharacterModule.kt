package com.ko.rickmorty.di.cartooncharacter

import com.ko.rickmorty.ui.cartooncharacter.CartoonCharacterViewModelFactory
import com.ko.rickmorty.domain.usecase.GetCartoonCharacterUseCase
import com.ko.rickmorty.domain.usecase.UpdateCartoonCharacterUseCase
import dagger.Module
import dagger.Provides

@Module
class CartoonCharacterModule {

    @CartoonCharacterScope
    @Provides
    fun provideCartoonCharacterViewModelFactory(
        getCartoonCharacterUseCase: GetCartoonCharacterUseCase,
        updateCartoonCharacterUseCase: UpdateCartoonCharacterUseCase
    ): CartoonCharacterViewModelFactory {
        return CartoonCharacterViewModelFactory(
            getCartoonCharacterUseCase,
            updateCartoonCharacterUseCase
        )
    }
}