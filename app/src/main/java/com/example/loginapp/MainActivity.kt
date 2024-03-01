package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.loginapp.mockData.models.mockdata
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var loginBtn : Button
    private lateinit var emailEt : EditText
    private lateinit var  passwordET : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginBtn = findViewById(R.id.loginBtn)
        emailEt = findViewById(R.id.emailET)
        passwordET = findViewById(R.id.passwordET)
        loginBtn.setOnClickListener{
            Log.i("ingesoft", "boton presieonado")
            val email = emailEt.text.toString()
            val password = passwordET.text.toString()
            if (email.isEmpty() || password.isEmpty()){
                Log.i("Invalid data")
                Snackbar.make(it, "El correo o contraseña vacios",Snackbar.LENGTH_SHORT.show())
                return@setOnClickListener
            }
            val isValidUser = mockdata.users.any{}
        }
    }
}