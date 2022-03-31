package com.github.bgrebennikov.jetpacknavigationexample.ui.main.explore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.github.bgrebennikov.jetpacknavigationexample.R
import com.github.bgrebennikov.jetpacknavigationexample.data.ExploreItemModel
import com.github.bgrebennikov.jetpacknavigationexample.databinding.FragmentDetailsBinding
import com.github.bgrebennikov.jetpacknavigationexample.extensions.findRootNavController
import com.github.bgrebennikov.jetpacknavigationexample.ui.base.BaseFragment


class DetailsFragment : BaseFragment<FragmentDetailsBinding>(
    FragmentDetailsBinding::inflate
) {

    private val args by navArgs<DetailsFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding){
            title.text = args.name
            backBtn.setOnClickListener{
                findRootNavController().popBackStack()
            }
        }

    }

}