package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent3.*
import kotlinx.android.synthetic.main.activity_internet.*

class Intent3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent3)

        b1.setOnClickListener {
           val internet = Intent(this@Intent3, Internet::class.java)
            startActivity(internet)
        }

        b2.setOnClickListener {
            val intent5 = Intent(this@Intent3, Intent5::class.java)

            startActivity(intent5)
        }
        b3.setOnClickListener {
            val intent6 = Intent(this@Intent3, Intent6::class.java)

            startActivity(intent6)
        }
    }
}