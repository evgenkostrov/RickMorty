package com.ko.rickmorty.data.repository.datasourceimpl

import com.ko.rickmorty.data.api.RickAndMortyService
import com.ko.rickmorty.data.model.CartoonCharacterList
import com.ko.rickmorty.data.repository.datasource.CartoonCharacterRemoteDataSource
import retrofit2.Response

class CartoonCharacterRemoteDataSourceImpl(
    private val rickAndMortyService: RickAndMortyService,
): CartoonCharacterRemoteDataSource {
    override suspend fun getCartoonCharactersFromApi(page: Int): Response<CartoonCharacterList> {
        return rickAndMortyService.getCartoonCharacters(page)
    }
}