package com.ko.rickmorty.di.core

import com.ko.rickmorty.domain.repository.CartoonCharacterRepository
import com.ko.rickmorty.domain.usecase.GetCartoonCharacterUseCase
import com.ko.rickmorty.domain.usecase.UpdateCartoonCharacterUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UseCaseModule {

    @Singleton
    @Provides
    fun provideGetCartoonCharacterUseCase(cartoonCharacterRepository: CartoonCharacterRepository): GetCartoonCharacterUseCase {
        return GetCartoonCharacterUseCase(cartoonCharacterRepository)
    }

    @Singleton
    @Provides
    fun provideUpdateCartoonCharacterUseCase(cartoonCharacterRepository: CartoonCharacterRepository): UpdateCartoonCharacterUseCase {
        return UpdateCartoonCharacterUseCase(cartoonCharacterRepository)
    }
}