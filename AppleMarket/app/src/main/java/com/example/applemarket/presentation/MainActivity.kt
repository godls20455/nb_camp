package com.example.applemarket.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.applemarket.data.DataSource
import com.example.applemarket.data.Goods
import com.example.applemarket.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val myAdapter : MyAdapter by lazy {
        MyAdapter { goods ->
            adapterOnClick(goods) }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val dataSource = DataSource.getDataSource()
        myAdapter.goodsList = dataSource.getDataList()

        binding.rv.adapter = myAdapter
        binding.rv.layoutManager = LinearLayoutManager(this)

    private fun adapterOnClick(goods: Goods) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("detail", goods)
        startActivity(intent)
    }
}