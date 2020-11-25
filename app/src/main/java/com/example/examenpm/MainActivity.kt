package com.example.examenpm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.util.Log.v as v1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b1: Button = findViewById(R.id.b1)
        val et1: EditText = findViewById(R.id.et1)

        b1.setEnabled(false)
        var palabras=" "
        et1.onEditorAction(EditorInfo.IME_ACTION_DONE)
        et1.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                palabras= et1.text.toString()
                var lista=palabras.split(" ")

                if(lista.size>=4){
                    b1.setEnabled(true)
                }else{
                    b1.setEnabled(false)
                }
            }
        })

       b1.setOnClickListener{
            val intent = Intent(this, SegundaActivity::class.java)
            intent.putExtra(SegundaActivity.VAR1, palabras)
            startActivity(intent)
        }
    }
}