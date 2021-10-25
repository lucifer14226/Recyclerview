package com.example.newsfresh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), NewsItemClciked {
    private lateinit var recyclerView:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.Horizontal_view)
        recyclerView.layoutManager=LinearLayoutManager(this)
        val items=fetchdata()
        val adapter= NewsListAdapter(items,this)
        recyclerView.adapter= adapter
    }
    private fun fetchdata():ArrayList<String>{
        val list=ArrayList<String>()
        for (i in 0 until 100){
            list.add("Item $i")
        }
        return list
    }

    override fun onitemClciked(item: String) {
        Toast.makeText(this,"clicked item is $item",Toast.LENGTH_LONG).show()
    }
}