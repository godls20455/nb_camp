package com.example.applemarket.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.applemarket.R
import com.example.applemarket.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}