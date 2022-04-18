package com.ko.rickmorty.di.core

import com.ko.rickmorty.data.api.RickAndMortyService
import com.ko.rickmorty.data.repository.datasource.CartoonCharacterRemoteDataSource
import com.ko.rickmorty.data.repository.datasourceimpl.CartoonCharacterRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideCartoonCharacterRemoteDataSource(rickAndMortyService: RickAndMortyService): CartoonCharacterRemoteDataSource {
        return CartoonCharacterRemoteDataSourceImpl(rickAndMortyService)
    }
}