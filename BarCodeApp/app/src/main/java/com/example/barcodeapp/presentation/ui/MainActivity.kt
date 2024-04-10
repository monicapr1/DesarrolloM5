package com.example.barcodeapp.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.barcodeapp.R
import com.example.barcodeapp.domain.adapter.ProductAdapter
import com.example.barcodeapp.domain.models.Product
import com.example.barcodeapp.presentation.viewmodels.MainviewModel
import com.journeyapps.barcodescanner.ScanContract
import com.journeyapps.barcodescanner.ScanOptions
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var productsRecycleView :RecyclerView
    private  val products = mutableListOf<Product>()
    private val mainviewModel: MainviewModel by viewModels<MainviewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button= findViewById(R.id.btn_scan)
        setUpRecicleView()

        button.setOnClickListener{
            scanCode()
        }
        Toast.makeText(this, mainviewModel.getString(), Toast.LENGTH_LONG).show()
    }
    private fun scanCode(){
        val options = ScanOptions()
        options.setPrompt("Escanee un código de barras")
        options.setBeepEnabled(true)
        options.setOrientationLocked(false)
        barcodeLauncher.launch(options)

    }
    private fun setUpRecicleView(){
        productsRecycleView = findViewById(R.id.rv_products)
        productsRecycleView.adapter = ProductAdapter(products)
        productsRecycleView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
    private val barcodeLauncher = registerForActivityResult(ScanContract()){ result ->
        if (result.contents == null){

            Toast.makeText(this, "Cancelado", Toast.LENGTH_LONG).show()
        }
        else{
            val product = Product.products.find { p-> p.barcode == result.contents }
            if (product != null){
                products.add(product)

                productsRecycleView.adapter?.notifyDataSetChanged()
                Toast.makeText(this, "Escaneado: ${product.name}", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "Producto no encintrado", Toast.LENGTH_LONG).show()
            }

        }
    }
}