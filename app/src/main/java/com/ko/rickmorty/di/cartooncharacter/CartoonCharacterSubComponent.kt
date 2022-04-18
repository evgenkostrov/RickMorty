package com.ko.rickmorty.di.cartooncharacter

import com.ko.rickmorty.ui.cartooncharacter.CartoonCharacterFragment
import dagger.Subcomponent

@CartoonCharacterScope
@Subcomponent(modules = [CartoonCharacterModule::class])
interface CartoonCharacterSubComponent {
    fun inject(cartoonCharacterFragment: CartoonCharacterFragment)

    @Subcomponent.Factory
    interface Factory {
        fun create(): CartoonCharacterSubComponent
    }
}