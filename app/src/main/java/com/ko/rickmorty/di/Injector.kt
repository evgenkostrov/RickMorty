package com.ko.rickmorty.di

import com.ko.rickmorty.di.cartooncharacter.CartoonCharacterSubComponent
import com.ko.rickmorty.di.cartooncharacterdetail.CartoonCharacterDetailSubcomponent
import com.ko.rickmorty.di.competition.CompetitionSubcomponent

interface Injector {
    fun createCartoonCharacterSubcomponent(): CartoonCharacterSubComponent
    fun createCartoonCharacterDetailSubcomponent(): CartoonCharacterDetailSubcomponent
    fun createCompetitionSubcomponent(): CompetitionSubcomponent
}