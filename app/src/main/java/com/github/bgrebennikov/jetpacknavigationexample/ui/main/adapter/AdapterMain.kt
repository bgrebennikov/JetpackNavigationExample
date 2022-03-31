package com.github.bgrebennikov.jetpacknavigationexample.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.github.bgrebennikov.jetpacknavigationexample.data.ExploreItemModel
import com.github.bgrebennikov.jetpacknavigationexample.databinding.ExploreItemBinding


class AdapterMain : ListAdapter<ExploreItemModel, AdapterMain.ViewHolder>(DiffCallback()) {

    var onItemSelected : (ExploreItemModel) -> Unit = {

    }

    inner class ViewHolder(
        private val binding: ExploreItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ExploreItemModel) {
            binding.item = item
            itemView.setOnClickListener {
                onItemSelected.invoke(item)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ExploreItemBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}