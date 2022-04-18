package com.ko.rickmorty.di.cartooncharacterdetail

import com.ko.rickmorty.ui.cartooncharacterdetail.CartoonCharacterDetailViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class CartoonCharacterDetailModule {

    @CartoonCharacterDetailScope
    @Provides
    fun provideCartoonCharacterDetailViewModelFactory(): CartoonCharacterDetailViewModelFactory {
        return CartoonCharacterDetailViewModelFactory()
    }
}