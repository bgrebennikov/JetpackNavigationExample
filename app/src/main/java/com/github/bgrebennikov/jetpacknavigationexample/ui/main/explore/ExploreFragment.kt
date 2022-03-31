package com.github.bgrebennikov.jetpacknavigationexample.ui.main.explore

import android.os.Bundle
import android.view.View
import com.github.bgrebennikov.jetpacknavigationexample.data.ExploreItemModel
import com.github.bgrebennikov.jetpacknavigationexample.databinding.FragmentExploreBinding
import com.github.bgrebennikov.jetpacknavigationexample.extensions.findRootNavController
import com.github.bgrebennikov.jetpacknavigationexample.ui.base.BaseFragment
import com.github.bgrebennikov.jetpacknavigationexample.ui.main.MainFragmentDirections
import com.github.bgrebennikov.jetpacknavigationexample.ui.main.adapter.AdapterMain


class ExploreFragment : BaseFragment<FragmentExploreBinding>(
    FragmentExploreBinding::inflate
) {

    private val mainAdapter = AdapterMain()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.namesList.apply {
            adapter = mainAdapter.apply {
                submitList(generateItems())
            }
        }

        mainAdapter.onItemSelected = {item ->
            val action = MainFragmentDirections.actionRootFragmentToDetailsFragment(item.name)
            findRootNavController().navigate(action)
        }

    }

    private fun generateItems() : List<ExploreItemModel>{

        return IntRange(0, 100).map {
            ExploreItemModel(
                it,
                "Item name: $it"
            )
        }

    }

}