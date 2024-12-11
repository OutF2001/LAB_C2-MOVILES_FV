package com.valdeos.flavio.usolayoutsv4


import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ejercicio01Activity : AppCompatActivity() {

    private lateinit var viewGreen: CardView
    private lateinit var buttonMostrar: Button
    private lateinit var buttonOcultar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio01) // Mueve esta línea aquí

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.ej01)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        viewGreen = findViewById(R.id.viewGreen)
        buttonMostrar = findViewById(R.id.buttonMostrar)
        buttonOcultar = findViewById(R.id.buttonOcultar)

        buttonMostrar.setOnClickListener {
            viewGreen.visibility = View.VISIBLE
        }

        buttonOcultar.setOnClickListener {
            viewGreen.visibility = View.INVISIBLE
        }
    }

}