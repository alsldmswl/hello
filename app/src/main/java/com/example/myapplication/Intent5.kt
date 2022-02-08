package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent5.*

class Intent5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent5)

        click2.setOnClickListener {
            val intent6 =  Intent(this@Intent5,Intent6::class.java)
            startActivity(intent6)
        }


    }
}