package com.ko.rickmorty.di.core

import com.ko.rickmorty.di.cartooncharacter.CartoonCharacterSubComponent
import com.ko.rickmorty.di.cartooncharacterdetail.CartoonCharacterDetailSubcomponent
import com.ko.rickmorty.di.competition.CompetitionSubcomponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        DatabaseModule::class,
        CacheDataModule::class,
        LocalDataModule::class,
        NetModule::class,
        RemoteDataModule::class,
        RepositoryModule::class,
        UseCaseModule::class
    ]
)
interface AppComponent {
    fun cartoonCharacterSubcomponent(): CartoonCharacterSubComponent.Factory
    fun cartoonCharacterDetailSubcomponent(): CartoonCharacterDetailSubcomponent.Factory
    fun competitionSubcomponent(): CompetitionSubcomponent.Factory
}