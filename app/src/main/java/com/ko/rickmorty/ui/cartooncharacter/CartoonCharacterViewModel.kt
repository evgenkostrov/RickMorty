package com.ko.rickmorty.ui.cartooncharacter

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.ko.rickmorty.domain.usecase.GetCartoonCharacterUseCase
import com.ko.rickmorty.domain.usecase.UpdateCartoonCharacterUseCase
import com.ko.rickmorty.util.Network

class CartoonCharacterViewModel(
    private val getCartoonCharacterUseCase: GetCartoonCharacterUseCase,
    private val updateCartoonCharacterUseCase: UpdateCartoonCharacterUseCase
) : ViewModel() {

    val page = MutableLiveData(0)
    val dataLoading = MutableLiveData(true)

    fun getCartoonCharacters(context: Context) = liveData {
        if (Network.isNetworkAvailable(context)) {
            dataLoading.value = true
            val list = getCartoonCharacterUseCase.execute(page.value!!)
            dataLoading.value = false
            emit(list)
        } else {
            emit(listOf())
        }
    }

    fun updateCartoonCharacters(context: Context) = liveData {
        if (Network.isNetworkAvailable(context)) {
            dataLoading.value = true
            page.value = page.value!!.inc()
            val list = updateCartoonCharacterUseCase.execute(page.value!!)
            dataLoading.value = false
            emit(list)
        } else {
            emit(listOf())
        }
    }

    fun getBack(context: Context) = liveData {
        if (Network.isNetworkAvailable(context)) {
            if (page.value!! > 1) {
                dataLoading.value = true
                page.value = page.value!!.dec()
                val list = updateCartoonCharacterUseCase.execute(page.value!!)
                dataLoading.value = false
                emit(list)
            }
        } else {
            emit(listOf())
        }
    }

    fun currentPage(): Int {
        return page.value!!
    }

    fun reset(context: Context) {
        page.value = page.value?.dec()
        getBack(context)
    }
}