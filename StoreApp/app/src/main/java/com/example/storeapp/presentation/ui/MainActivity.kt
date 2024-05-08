package com.example.storeapp.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.storeapp.R
import com.example.storeapp.domain.adapters.ProductsAdapter
import com.example.storeapp.domain.models.Product

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var productsAdapter : ProductsAdapter
    private lateinit var progressBar : ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycleView)
        recyclerView.adapter = productsAdapter
        productsAdapter = ProductsAdapter(Product.productList)
        progressBar = findViewById(R.id.progress_bar)

        val layoutManager = GridLayoutManager(this, 2)
        recyclerView.layoutManager = layoutManager
    }
}