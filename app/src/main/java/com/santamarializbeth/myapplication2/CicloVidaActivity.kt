package com.santamarializbeth.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

const val TAG_LOG = "LOG_PRINCIPAL"

class CicloVidaActivity : AppCompatActivity() {
    lateinit var buttonFinalizar :  Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciclo_vida)
        val mensaje = "En el evento onCreate()"
        Log.d(TAG_LOG, mensaje)
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
        buttonFinalizar =  findViewById(R.id.buttonFinalizar)
        buttonFinalizar.setOnClickListener {
            finish()
        }

    }

    override fun onStart() {
        super.onStart()
        val mensaje = "En el evento onStart()"
        Log.d(TAG_LOG, mensaje)
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        val mensaje = "En el evento onResume()"
        Log.d(TAG_LOG, mensaje)
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        val mensaje = "En el evento onPause()"
        Log.d(TAG_LOG, mensaje)
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        val mensaje = "En el evento onStop()"
        Log.d(TAG_LOG, mensaje)
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        val mensaje = "En el evento onDestroy()"
        Log.d(TAG_LOG, mensaje)
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        val mensaje = "En el evento onRestart()"
        Log.d(TAG_LOG, mensaje)
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
    }
}