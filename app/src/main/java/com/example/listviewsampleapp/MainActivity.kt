package com.example.listviewsampleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_row.*

class MainActivity : AppCompatActivity() {


    var stringList=ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stringList.add("Adana")
        stringList.add("İstanbul")
        stringList.add("Eskişehir")
        stringList.add("Yozgat")


        var adapter= ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stringList)

        listView.adapter=adapter

        listView.setOnItemClickListener{parent,view,position,Id->

            var cityName=stringList[position]

            var intent = Intent(this,DetailActivity::class.java)
            intent.putExtra("City",cityName)

            startActivity(intent)

        }

    }

}
