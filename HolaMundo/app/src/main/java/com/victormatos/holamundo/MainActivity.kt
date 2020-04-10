package com.victormatos.holamundo

import Others.Functions
import Others.Operadores
import Others.Variables
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // Variables().showCase()
       // Operadores().showCase()
        Functions().showCase()
    }
}
