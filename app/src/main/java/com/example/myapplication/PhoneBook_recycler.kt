package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_phone_book_recycler.*

class PhoneBook_recycler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_book_recycler)

        val phonbook = createFakePhoneBook(30)
        val phonebookrecycler = Phonebookrecycler(phonebookList = phonbook,
            inflater = LayoutInflater.from(this@PhoneBook_recycler),   activity = this)

        Phonebookrecyclerview.adapter = phonebookrecycler
        Phonebookrecyclerview.layoutManager = LinearLayoutManager(this@PhoneBook_recycler)
    }


    fun createFakePhoneBook(fakeNumber: Int = 10, phoneBook: PhoneBook = PhoneBook()): PhoneBook {
        for (i in 0 until fakeNumber) {
            phoneBook.addPerson(
                Person(name = "" + i + "번째 사람", number = "" + i + "번째 사람의 전화번호")
            )
        }
        return phoneBook
    }
}


class Phonebookrecycler(
    val phonebookList: PhoneBook,
    val inflater: LayoutInflater,
    val activity : Activity
    ): RecyclerView.Adapter<Phonebookrecycler.ViewHolder>() {

        inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
            val personName :TextView
            init {
                personName = itemView.findViewById(R.id.person_name)
                itemView.setOnClickListener {
                    val intent = Intent(activity, phone_book_detail::class.java)
                    intent.putExtra("name", phonebookList.personList.get(adapterPosition).name)
                    intent.putExtra("number", phonebookList.personList.get(adapterPosition).number)
                    activity.startActivity(intent)
                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.phonebook_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.personName.setText(phonebookList.personList.get(position).name)
    }

    override fun getItemCount(): Int {

       return phonebookList.personList.size
    }


}