package com.ko.rickmorty.ui.competition

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ko.rickmorty.domain.usecase.UpdateCartoonCharacterUseCase
import javax.inject.Inject



class CompetitionViewModelFactory (

    private val updateCartoonCharacterUseCase: UpdateCartoonCharacterUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CompetitionViewModel::class.java)) {
            return CompetitionViewModel(updateCartoonCharacterUseCase) as T
        }

        throw IllegalArgumentException("Cannot create view model for ${modelClass.name}")
    }
}