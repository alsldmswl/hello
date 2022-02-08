package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent3.*
import kotlinx.android.synthetic.main.activity_intent4.*

class Intent4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent4)


        click.setOnClickListener {
            val intent5 = Intent(this@Intent4, Intent5::class.java)

            startActivity(intent5)
        }
    }
}