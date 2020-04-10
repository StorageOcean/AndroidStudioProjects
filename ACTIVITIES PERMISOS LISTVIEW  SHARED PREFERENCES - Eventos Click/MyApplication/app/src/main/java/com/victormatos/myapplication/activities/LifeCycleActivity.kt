package com.victormatos.myapplication.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import com.victormatos.myapplication.R

class LifeCycleActivity : LifeCycleEventsActivity() {

    private var exitEnabled = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
    }

    override fun onBackPressed() {
        if (exitEnabled){
            super.onBackPressed()
        }
        exitEnabled = true
        Toast.makeText(this,"Click back again to exist screem", Toast.LENGTH_SHORT).show()
        Handler().postDelayed(
            Runnable { exitEnabled = false },2000
        )
    }
}
