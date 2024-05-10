package com.example.searchimageapp.presentation

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.searchimageapp.databinding.FragmentSearchBinding

class ImageListAdapter() : RecyclerView.Adapter<ImageListAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageListAdapter.Holder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ImageListAdapter.Holder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class Holder(private val binding: FragmentSearchBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(){

        }
    }
}