package com.ko.rickmorty.di.core

import com.ko.rickmorty.data.repository.CartoonCharacterRepositoryImpl
import com.ko.rickmorty.data.repository.datasource.CartoonCharacterCacheDataSource
import com.ko.rickmorty.data.repository.datasource.CartoonCharacterLocalDataSource
import com.ko.rickmorty.data.repository.datasource.CartoonCharacterRemoteDataSource
import com.ko.rickmorty.domain.repository.CartoonCharacterRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Singleton
    @Provides
    fun provideCartoonCharacterRepository(
        cartoonCharacterCacheDataSource: CartoonCharacterCacheDataSource,
        cartoonCharacterLocalDataSource: CartoonCharacterLocalDataSource,
        cartoonCharacterRemoteDataSource: CartoonCharacterRemoteDataSource
    ): CartoonCharacterRepository {
        return CartoonCharacterRepositoryImpl(
            cartoonCharacterCacheDataSource,
            cartoonCharacterLocalDataSource,
            cartoonCharacterRemoteDataSource
        )
    }
}