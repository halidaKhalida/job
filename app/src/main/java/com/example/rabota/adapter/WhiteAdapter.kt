package com.example.rabota.adapter

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rabota.R
import com.example.rabota.model.User

class WhiteAdapter(var list: ArrayList<User>):RecyclerView.Adapter<WhiteAdapter.WhiteViewholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WhiteViewholder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.iteam2,parent,false)
        return WhiteViewholder(view)
    }

    override fun getItemCount() =list.size

    override fun onBindViewHolder(holder: WhiteViewholder, position: Int) {
       val white=list[position]
        holder.apply {
            text3.text=white.text3
            text4.text=white.text4
        }
    }
    class WhiteViewholder(view:View):RecyclerView.ViewHolder(view){
        val text3=view.findViewById<TextView>(R.id.tv_text3)
        val text4=view.findViewById<TextView>(R.id.tv_text4)
    }
}
