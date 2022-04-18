package com.ko.rickmorty.di.core

import com.ko.rickmorty.data.db.dao.CartoonCharacterDao
import com.ko.rickmorty.data.repository.datasource.CartoonCharacterLocalDataSource
import com.ko.rickmorty.data.repository.datasourceimpl.CartoonCharacterLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideCartoonCharacterLocalDatasource(cartoonCharacterDao: CartoonCharacterDao): CartoonCharacterLocalDataSource {
        return CartoonCharacterLocalDataSourceImpl(cartoonCharacterDao, Dispatchers.IO)
    }
}