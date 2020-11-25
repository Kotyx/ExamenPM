package com.example.examenpm

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SegundaActivity : AppCompatActivity(){
    companion object {
        const val VAR1 = "VARIABLE1"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.segunda_activity)

        val tv1: TextView = findViewById(R.id.tv1)
        val et1: TextView = findViewById(R.id.et1)
        val b1: Button = findViewById(R.id.b1)
        val b2: Button = findViewById(R.id.b2)
        val b3: Button = findViewById(R.id.b3)
        val resul=intent.getStringExtra(VAR1)
        var lista= resul?.split(" ")
        if (lista != null) {
            for(i in lista){
                tv1.text=(i+"\n")
            }
        }
        b1.setOnClickListener{
            if (lista != null) {
                for(i in lista){
                    tv1.text=((i+" "+i.length))
                }
            }
        }
        b2.setOnClickListener{
            var ordenar= arrayOf(lista)
            ordenar.sort()
            for(i in ordenar){
                tv1.text=(i.toString()+"\n")
            }
        }
        b3.setOnClickListener{
            val longitud=et1.text
            if (lista != null) {
                for(i in lista){
                    if(i.length >= longitud.length){
                        tv1.text= i
                    }
                }
            }
        }
    }
}