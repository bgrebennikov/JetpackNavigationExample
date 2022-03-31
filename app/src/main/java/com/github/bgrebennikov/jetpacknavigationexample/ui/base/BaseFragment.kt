package com.github.bgrebennikov.jetpacknavigationexample.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

open class BaseFragment<T : ViewBinding>(
    private val inflateMethod : (LayoutInflater, ViewGroup?, Boolean) -> T
) : Fragment() {

    private var _binding : T? = null
    val binding get () = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflateMethod.invoke(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}