package com.ko.rickmorty.di.core

import android.content.Context
import com.ko.rickmorty.di.cartooncharacter.CartoonCharacterSubComponent
import com.ko.rickmorty.di.cartooncharacterdetail.CartoonCharacterDetailSubcomponent
import com.ko.rickmorty.di.competition.CompetitionSubcomponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
    subcomponents = [
        CartoonCharacterSubComponent::class,
        CartoonCharacterDetailSubcomponent::class,
        CompetitionSubcomponent::class
    ]
)
class AppModule(private val context: Context) {

    @Singleton
    @Provides
    fun provideApplicationContext(): Context {
        return context.applicationContext
    }
}