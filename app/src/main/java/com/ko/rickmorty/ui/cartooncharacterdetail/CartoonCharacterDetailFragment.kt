package com.ko.rickmorty.ui.cartooncharacterdetail

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.ko.rickmorty.R
import com.ko.rickmorty.databinding.FragmentCartoonCharacterDetailBinding
import com.ko.rickmorty.ui.base.BaseFragment
import javax.inject.Inject

class CartoonCharacterDetailFragment :
    BaseFragment<FragmentCartoonCharacterDetailBinding, CartoonCharacterDetailViewModel>(
        R.layout.fragment_cartoon_character_detail
    ) {

    @Inject
    lateinit var factory: CartoonCharacterDetailViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getInjector().createCartoonCharacterDetailSubcomponent().inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModel(
            ViewModelProvider(viewModelStore, factory)[CartoonCharacterDetailViewModel::class.java]
        )

        initUI()
    }

    private fun initUI() {
        arguments?.let { bundle ->
            val cartoonCharacterFromArg =
                CartoonCharacterDetailFragmentArgs.fromBundle(bundle).argCartoonCharacter

            if (cartoonCharacterFromArg != null) {
                binding?.let {
                    (requireActivity() as AppCompatActivity).supportActionBar?.title =
                        getString(R.string.details_of, cartoonCharacterFromArg.name)

                    it.cartoonCharacter = cartoonCharacterFromArg
                    it.viewModel = viewModel
                }
            }
        }
    }
}