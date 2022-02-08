package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView

//Listview -> 유사하게 반복되는 뷰를 그리기 위한 도구
//방법 -> Addview: item을 담을 xml을 만들어준다. 그 xml에 내용을 채워준다. container view에 더해준다. 반복한다.
// Listview, Recycleview(가장 효율적)

class Addview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addview)

        //item List 준비
        val carList = ArrayList<Car>()
        for (i in 0 until 10){
            carList.add(Car(""+i+"번째 자동차", ""+i+"순위 엔진"))
        }

        val container =findViewById<LinearLayout>(R.id.addview_container)
        val inflater = LayoutInflater.from(this@Addview)
        for (i in 0 until carList.size){
           val itemview = inflater.inflate(R.layout.item_view, null)
            val carNameView = itemview.findViewById<TextView>(R.id.car_name)
            val carEngineView = itemview.findViewById<TextView>(R.id.car_engine)

            carNameView.setText(carList.get(i).name)
            carEngineView.setText(carList.get(i).engine)
            container.addView(itemview)


        }


    }
}
class Car(val name: String, val engine: String ){

}