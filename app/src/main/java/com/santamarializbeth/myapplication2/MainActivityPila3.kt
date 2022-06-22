package com.santamarializbeth.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivityPila3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_pila3)
        val buttonNavegar = findViewById<Button>(R.id.buttonNavegar)
        buttonNavegar.setOnClickListener {
            val intencion = Intent(this,MainActivityPila1::class.java)
            startActivity(intencion)
            finish()
        }
    }
}