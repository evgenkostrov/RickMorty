package com.ko.rickmorty.data.repository.datasourceimpl

import com.ko.rickmorty.data.db.dao.CartoonCharacterDao
import com.ko.rickmorty.data.model.CartoonCharacter
import com.ko.rickmorty.data.repository.datasource.CartoonCharacterLocalDataSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CartoonCharacterLocalDataSourceImpl(
    private val cartoonCharacterDao: CartoonCharacterDao,
    private val dispatcher: CoroutineDispatcher = Dispatchers.IO
) : CartoonCharacterLocalDataSource {
    override suspend fun getCartoonCharactersFromDatabase(): List<CartoonCharacter> {
        return cartoonCharacterDao.getCartoonCharacters()
    }

    override suspend fun saveCartoonCharactersToDatabase(cartoonCharacters: List<CartoonCharacter>) {
        CoroutineScope(dispatcher).launch {
            cartoonCharacterDao.saveCartoonCharacters(cartoonCharacters)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(dispatcher).launch {
            cartoonCharacterDao.deleteAllCartoonCharacters()
        }
    }
}