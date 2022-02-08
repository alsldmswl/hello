package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_shared_preference.*

class SharedPreference : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)



        val sharedPreference = getSharedPreferences("sp1", MODE_PRIVATE)
        load_button.setOnClickListener{
            val editor = sharedPreference.edit()
            editor.putString("hello","안녕하세요")
            editor.putString("good bye","안녕히가세요")
            editor.commit()

        }

        load_button.setOnClickListener {
            //값을 불러오는 방법
            val sharedPreference = getSharedPreferences("sp1", MODE_PRIVATE)

            val value1 = sharedPreference.getString("hello","데이터 없음")
            val value2 = sharedPreference.getString("good bye","데이터 없음")
           Log.d("Key-value","Value:" + value1)
            Log.d("Key-value","Value:" + value2)
        }

        delete_button
    }
}