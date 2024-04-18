package com.example.applemarket.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.applemarket.R
import com.example.applemarket.data.Goods
import com.example.applemarket.databinding.MainItemLayoutBinding

class MyAdapter(private val onClick: (Goods) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var goodsList = listOf<Goods>()

    inner class MyHolder (private var binding: MainItemLayoutBinding, val onClick: (Goods) -> Unit) :
    RecyclerView.ViewHolder(binding.root){
        private var currentGoods: Goods? = null

        init {
            itemView.setOnClickListener{
                currentGoods?.let{
                    onClick(it)
                }
            }
        }

        fun bind(goods: Goods) {
            binding.apply {
                tvName.text = goods.name
                tvAddress.text = goods.address
                tvPrice.text = goods.price.toString()
                tvChat.text = goods.chat.toString()
                tvBell.text = goods.like.toString()
                ivGoods.setImageResource(goods.image)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_item_layout, parent, false)
        return MyHolder(MainItemLayoutBinding.bind(view), onClick)
    }

    override fun getItemCount(): Int {
        return goodsList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val holder = holder as MyHolder
        holder.bind(goodsList[position])
    }
}

