package com.github.bgrebennikov.jetpacknavigationexample.ui.main.adapter

import androidx.recyclerview.widget.DiffUtil
import com.github.bgrebennikov.jetpacknavigationexample.data.ExploreItemModel

class DiffCallback : DiffUtil.ItemCallback<ExploreItemModel>() {
    override fun areItemsTheSame(oldItem: ExploreItemModel, newItem: ExploreItemModel): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ExploreItemModel, newItem: ExploreItemModel): Boolean {
        return oldItem == newItem
    }
}