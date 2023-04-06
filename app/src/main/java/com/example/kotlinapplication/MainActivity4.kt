package com.example.kotlinapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity4 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val finalList = ArrayList<ListModel>()

        for ( i in 1..20){
            finalList.add(ListModel(R.drawable.image2))
        }

        val adapter = RecyclerVIewAdapter(finalList)
        recyclerView.adapter = adapter

    }
}