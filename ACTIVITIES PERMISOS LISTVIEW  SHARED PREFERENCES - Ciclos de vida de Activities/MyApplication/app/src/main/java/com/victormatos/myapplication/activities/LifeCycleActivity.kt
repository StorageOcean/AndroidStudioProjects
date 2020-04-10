package com.victormatos.myapplication.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.victormatos.myapplication.R

class LifeCycleActivity : LifeCycleEventsActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
    }
}
