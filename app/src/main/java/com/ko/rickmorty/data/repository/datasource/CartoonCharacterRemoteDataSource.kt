package com.ko.rickmorty.data.repository.datasource

import com.ko.rickmorty.data.model.CartoonCharacterList
import retrofit2.Response

interface CartoonCharacterRemoteDataSource {
    suspend fun getCartoonCharactersFromApi(page: Int = 1): Response<CartoonCharacterList>
}