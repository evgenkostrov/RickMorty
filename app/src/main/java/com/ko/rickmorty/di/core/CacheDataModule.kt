package com.ko.rickmorty.di.core

import com.ko.rickmorty.data.repository.datasource.CartoonCharacterCacheDataSource
import com.ko.rickmorty.data.repository.datasourceimpl.CartoonCharacterCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideCartoonCharacterCacheDatasource(): CartoonCharacterCacheDataSource {
        return CartoonCharacterCacheDataSourceImpl()
    }
}