package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent3.*
import kotlinx.android.synthetic.main.activity_page2.*

class Page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        button_5.setOnClickListener {
            val page3 = Intent(this@Page2, Page3::class.java)
            startActivity(page3)
        }


    }
}