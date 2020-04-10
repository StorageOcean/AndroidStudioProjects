package com.victormatos.myapplication.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.victormatos.myapplication.R


class ClickEventsActivity : AppCompatActivity(), View.OnClickListener {


    //1) Click en XML
    //2) Click en line
    //3) Click by IDS en 'when'
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_click_events)

        clickInLine()

        val btn1 = findViewById<Button>(R.id.buttonClickMulti1)
        val btn2 = findViewById<Button>(R.id.buttonClickMulti2)
        val btn3 = findViewById<Button>(R.id.buttonClickMulti3)

        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)

    }

    fun xmlClick(view: View) {
        Toast.makeText(this, "Click en XML!", Toast.LENGTH_SHORT).show()
    }

    private fun clickInLine() {
        val btn = findViewById<Button>(R.id.button_click_line)
        btn.setOnClickListener {
            Toast.makeText(this, "Click in line!", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.buttonClickMulti1 -> Toast.makeText(this, "Click  Multi 1!", Toast.LENGTH_SHORT)
                .show()
            R.id.buttonClickMulti2 -> Toast.makeText(this, "Click  Multi 2!", Toast.LENGTH_SHORT)
                .show()
            R.id.buttonClickMulti3 -> Toast.makeText(this, "Click  Multi 3!", Toast.LENGTH_SHORT)
                .show()
        }
    }

}



