package com.santamarializbeth.myapplication2


import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    lateinit var buttonSaludo : Button //declaracion de un variable
    var buttonSaludo2 : Button? = null //otra alternativa

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Zona de inicializacion de Saludo
        buttonSaludo = findViewById(R.id.buttonSaludo)

        Toast.makeText(this, "Hola mundo", Toast.LENGTH_LONG)
        //setTitle("otro texto");

        val actionBar: ActionBar? = supportActionBar
        //actionBar?.setTitle(R.string.texActionBar_texto)
        if(actionBar!=null){
            actionBar.title= "otro texto adicional"
        }
        actionBar?.setTitle(getString(R.string.texActionBar_texto))
        //actionBar!!.title = "Otro texto adicional"
        //actionBar?.title = "Otro texto adicional"

        var titulo:String?
        if(actionBar?.title != null){
            titulo= actionBar.title.toString() + getString(R.string.texActionBar_texto)
        }else{
            titulo= "unknown" + getString(R.string.texActionBar_texto)
        }
        var titulo2= (actionBar?.title.toString() ?: "unknow") + getString(R.string.texActionBar_texto)

        //Eventos
        buttonSaludo.setOnClickListener { miVista: View ->
            Toast.makeText(this,"Saludos a todos", Toast.LENGTH_LONG).show()
            miVista.setBackgroundColor(Color.GREEN)

        }

        fun longOperationAsync(longOperation: ()->Unit, callback: ()->Unit) {
            Thread({
                longOperation()
                callback()
            }).start()
        }
        // Usage
//        longOperationAsync(
//            longOperation = { Thread.sleep(1000L) },
//            callback = { println("After one second") } //Prints after one second
//        )
//        println("Now")

        fun EjemploListaMutableEnteros(){
            fun MutableList<Int>.swap(index1: Int, index2: Int) {
                val tmp = this[index1]
                this[index1] = this[index2]
                this[index2] = tmp
            }
            var myListInt : MutableList<Int> = mutableListOf(1,2)
            println("$myListInt")
            myListInt.swap(1,0)
            println("$myListInt")
        }

    }

    fun miOnclickSaludo(view: View){
    }
}