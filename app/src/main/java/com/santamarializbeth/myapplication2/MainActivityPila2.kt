package com.santamarializbeth.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivityPila2 : AppCompatActivity() {
    lateinit var buttonNavegar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_pila2)
        buttonNavegar = findViewById(R.id.buttonNavegar)
        buttonNavegar.setOnClickListener {
            val intencion = Intent(this,MainActivityPila3::class.java)
            startActivity(intencion)
            //finish()
        }
    }
}