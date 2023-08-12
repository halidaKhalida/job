package com.example.rabota.adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rabota.R
import com.example.rabota.model.Iteam3

class Iteam3Adapter(val list: ArrayList<Iteam3>):RecyclerView.Adapter<Iteam3Adapter.IteanViewholdere>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IteanViewholdere {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.iteam3,parent,false)
        return IteanViewholdere(view)
    }

    override fun getItemCount()=list.size



    override fun onBindViewHolder(holder: IteanViewholdere, position: Int) {
        val iteam33=list[position]
        holder.apply {
            vibor.text=iteam33.vibor
            green_text1.text=iteam33.green_text1
            grye_text1.text=iteam33.grye_text1
            money1.text=iteam33.money1
            grey_text2.text=iteam33.grey_text2
            black_text2.text=iteam33.black_text2
            grey_text3.text=iteam33.grey_text3
            hello.text=iteam33.hello
            green_text2.text=iteam33.green_text2
            text_in_oval1.text=iteam33.text_in_oval1
            text_in_oval2.text=iteam33.text_in_oval2
            text_in_oval3.text=iteam33.text_in_oval3
            money2.text=iteam33.money2
        }
    }
    class IteanViewholdere(view:View):RecyclerView.ViewHolder(view){
        val vibor=view.findViewById<TextView>(R.id.tv_vibor)
        val green_text1=view.findViewById<TextView>(R.id.tv_green_text1)
        val grye_text1=view.findViewById<TextView>(R.id.tv_grey_text1)
        val money1=view.findViewById<TextView>(R.id.tv_money1)
        val grey_text2=view.findViewById<TextView>(R.id.tv_grey_text2)
        val black_text2=view.findViewById<TextView>(R.id.tv_black_text2)
        val grey_text3=view.findViewById<TextView>(R.id.tv_grey_text3)
        val hello=view.findViewById<TextView>(R.id.tv_hello)
        val green_text2=view.findViewById<TextView>(R.id.tv_green_text2)
        val text_in_oval1=view.findViewById<TextView>(R.id.tv_text_in_oval1)
        val text_in_oval2=view.findViewById<TextView>(R.id.tv_text_in_oval2)
        val text_in_oval3=view.findViewById<TextView>(R.id.tv_text_in_oval3)
        val money2=view.findViewById<TextView>(R.id.tv_money2)
    }
}