package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Context : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_context)

        //Context -> ActivityManagerService(미리 구현 해놓은 기능)에 접근 하도록 해주는 역할-> 주변정보
        //안드로이드는 이미 많은 부분들이 만들어져 있다 -> 이런것들을 사용하기 위해선 Context가 필요한 경우가 많다

        val context = this
        val applicationContext = getApplicationContext()


    }
}