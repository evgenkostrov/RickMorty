package com.ko.rickmorty.data.repository.datasourceimpl

import com.ko.rickmorty.data.model.CartoonCharacter
import com.ko.rickmorty.data.repository.datasource.CartoonCharacterCacheDataSource

class CartoonCharacterCacheDataSourceImpl() : CartoonCharacterCacheDataSource {
    private val cartoonCharacterList = ArrayList<CartoonCharacter>()

    override suspend fun getCartoonCharactersFromCache(): List<CartoonCharacter> {
        return cartoonCharacterList
    }

    override suspend fun saveCartoonCharactersToCache(cartoonCharacters: List<CartoonCharacter>) {
        cartoonCharacterList.clear()
        cartoonCharacterList.addAll(cartoonCharacters)
    }
}