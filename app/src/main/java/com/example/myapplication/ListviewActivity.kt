package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_listview.*

class ListviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        val carList = ArrayList<Car>()
        for (i in 0 until 10){
            carList.add(Car(""+i+"번째 자동차", ""+i+"순위 엔진"))
        }

        val adapter = ListViewAdapter(carList, LayoutInflater.from(this@ListviewActivity))
        listview.adapter = adapter
        }
    }


class ListViewAdapter(
    val car: ArrayList<Car>,
    val layoutinflater: LayoutInflater
) : BaseAdapter(){



    //뷰를 그리는 부분
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = layoutinflater.inflate(R.layout.item_view, null)
        val carNameTextView = view.findViewById<TextView>(R.id.car_name)
        val carEngineTextView = view.findViewById<TextView>(R.id.car_engine)

        carNameTextView.setText(car.get(p0).name)
        carEngineTextView.setText(car.get(p0).engine)
        return view


    }

    //그리고자 하는 아이템 리스트의 하나(포지션에 해당하는)
    override fun getItem(p0: Int): Any {
        return car.get(p0)
    }

    //해당 포지션에 위치해 있는 아이템 뷰의 아이디 설정
    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    //그리고자 하는 아이템 리스트의 전체 갯수
    override fun getCount(): Int {
        return car.size
    }

}

class ViewHolder{
    var carName: TextView? = null
    var carEngine: TextView? = null
}