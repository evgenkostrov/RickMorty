package com.ko.rickmorty.di.competition

import com.ko.rickmorty.ui.competition.CompetitionFragment
import dagger.Subcomponent

@CompetitionScope
@Subcomponent(modules = [CompetitionModule::class])
interface CompetitionSubcomponent {
    fun inject(competitionFragment: CompetitionFragment)

    @Subcomponent.Factory
    interface Factory {
        fun create(): CompetitionSubcomponent
    }
}