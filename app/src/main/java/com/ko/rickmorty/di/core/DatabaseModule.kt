package com.ko.rickmorty.di.core

import android.content.Context
import androidx.room.Room
import com.ko.rickmorty.data.db.RickAndMortyDatabase
import com.ko.rickmorty.data.db.dao.CartoonCharacterDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideCartoonCharacterDatabase(context: Context): RickAndMortyDatabase {
        return Room.databaseBuilder(context, RickAndMortyDatabase::class.java, RickAndMortyDatabase.DATABASE_NAME)
            .build()
    }

    @Singleton
    @Provides
    fun provideCartoonCharacterDao(rickAndMortyDatabase: RickAndMortyDatabase): CartoonCharacterDao {
        return rickAndMortyDatabase.cartoonCharacterDao()
    }
}