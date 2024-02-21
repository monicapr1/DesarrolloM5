package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var boton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        boton = findViewById(R.id.btn_comprar)
        boton.setOnClickListener{
            val intent = Intent(this@MainActivity,SuccessActivity::class.java)
            startActivity(intent)
        }
    }

}