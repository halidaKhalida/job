package com.example.rabota

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rabota.adapter.ChanceAdapter
import com.example.rabota.adapter.WhiteAdapter
import com.example.rabota.model.Question
import com.example.rabota.model.User

class MainActivity : AppCompatActivity() {
    lateinit var horizantalList:ArrayList<Question>
    lateinit var horizantaltwoList:ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initView2()
    }

    private fun initView2() {
        loadList2()
        val rvhorizantaltwo = findViewById<RecyclerView>(R.id.rv_chat_list)
        rvhorizantaltwo.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvhorizantaltwo.adapter = WhiteAdapter(list = horizantaltwoList)
    }

    private fun loadList2() {
        horizantaltwoList = ArrayList()
        horizantaltwoList.add(User("Get tips to find work","Learn how to optimize search,\\nuse Connects, and more to\\nland your first job."))
        horizantaltwoList.add(User("My proposals","Learn how to optimize search,\\nuse Connects, and more to\\nland your first job."))
    }

    private fun initView() {
        loadList()
        val rvhorizantal = findViewById<RecyclerView>(R.id.rv_chat_list)


        rvhorizantal.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        rvhorizantal.adapter = ChanceAdapter(list = horizantalList)
//        val rvSearch = findViewById<RecyclerView>(R.id.rv_search)
//        rvSearch.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
//        rvSearch.adapter = SeachAdapter(list = searchList)
    }

    private fun loadList() {
        horizantalList = ArrayList()

        horizantalList.add(Question("Get tips to find work","Learn how to optimize search,\\nuse Connects, and more to\\nland your first job."))



    }
}