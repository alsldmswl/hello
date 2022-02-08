package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NullSafety : AppCompatActivity() {

    //lateinit -> 일단 초기화 하지 않고 사용하기 위한 것
    //!! -> null이 아님을 확신할 때 사용


    lateinit var lateCar: Car

    class Car(var number: Int){

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)

        val number:Int = 10
        val number1: Int? = null


        val number3 = number1?.plus(number) // ? 는 널이 아니면 이라는 뜻.
        Log.d("number","number3: "+ number3)

        //삼항 연산자 -> 엘비스 연산자(?:)
        val number4 = number1 ?: 10

        //사용하기 전에 반드시 초기화 해야한다.
        lateCar = Car(10)
        Log.d("number","late number: "+ lateCar.number)



    }

    fun plus(a: Int, b: Int?): Int{
        if(b!= null) return a+b
        else return a
    }

    fun plus2(a:Int, b: Int?):Int?{
        return b?.plus(a)
    }
}