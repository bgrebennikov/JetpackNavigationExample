package com.github.bgrebennikov.jetpacknavigationexample.ui.main.ideas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.github.bgrebennikov.jetpacknavigationexample.R
import com.github.bgrebennikov.jetpacknavigationexample.databinding.FragmentIdeaInfoBinding
import com.github.bgrebennikov.jetpacknavigationexample.ui.base.BaseFragment


class IdeaInfoFragment : BaseFragment<FragmentIdeaInfoBinding>(
    FragmentIdeaInfoBinding::inflate
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.backBtn.setOnClickListener {
            findNavController().popBackStack()
        }

    }

}