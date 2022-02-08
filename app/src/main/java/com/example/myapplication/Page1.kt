package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent3.*
import kotlinx.android.synthetic.main.activity_page1.*

class Page1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)



        button_in.setOnClickListener {
            val page2 = Intent(this@Page1, Page2::class.java)
            startActivity(page2)
        }
    }
}