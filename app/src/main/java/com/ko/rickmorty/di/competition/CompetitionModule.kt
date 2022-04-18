package com.ko.rickmorty.di.competition

import com.ko.rickmorty.domain.usecase.UpdateCartoonCharacterUseCase
import com.ko.rickmorty.ui.competition.CompetitionViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class CompetitionModule {
    @CompetitionScope
    @Provides
    fun provideCompetitionViewModelFactory(
        updateCartoonCharacterUseCase: UpdateCartoonCharacterUseCase
    ): CompetitionViewModelFactory {
        return CompetitionViewModelFactory(updateCartoonCharacterUseCase)
    }
}