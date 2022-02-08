package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page1.*
import kotlinx.android.synthetic.main.activity_page3.*

class Page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)



        person_1.setOnClickListener {
            val page4 = Intent(this@Page3, Page4::class.java)
            startActivity(page4)
        }
    }
}