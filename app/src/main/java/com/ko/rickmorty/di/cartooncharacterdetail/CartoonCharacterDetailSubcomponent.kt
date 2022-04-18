package com.ko.rickmorty.di.cartooncharacterdetail

import com.ko.rickmorty.ui.cartooncharacterdetail.CartoonCharacterDetailFragment
import dagger.Subcomponent

@CartoonCharacterDetailScope
@Subcomponent(modules = [CartoonCharacterDetailModule::class])
interface CartoonCharacterDetailSubcomponent {
    fun inject(cartoonCharacterDetailFragment: CartoonCharacterDetailFragment)

    @Subcomponent.Factory
    interface Factory {
        fun create(): CartoonCharacterDetailSubcomponent
    }
}