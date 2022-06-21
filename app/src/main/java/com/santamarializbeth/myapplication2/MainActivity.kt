package com.santamarializbeth.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {
    lateinit var editTextTextPassword : EditText //declaracion de un variable
    lateinit var textViewRegistro : TextView//declaracion de un variable
    lateinit var checkBoxNoCerrarCuenta : CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Hola mundo",Toast.LENGTH_LONG).show()

        fun inicializacion(){
            editTextTextPassword = findViewById(R.id.editTextTextPassword)
            textViewRegistro = findViewById(R.id.textViewRegistro)
            checkBoxNoCerrarCuenta = findViewById(R.id.checkBoxNoCerrarCuenta)
        }
        fun onCLick(){}
    }
}