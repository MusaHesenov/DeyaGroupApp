package com.example.ecommercepractice.activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.ecommercepractice.R
import com.example.ecommercepractice.databinding.ActivityBrandSeeAllBinding

class BrandSeeAll : AppCompatActivity() {
    private lateinit var binding : ActivityBrandSeeAllBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBrandSeeAllBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}