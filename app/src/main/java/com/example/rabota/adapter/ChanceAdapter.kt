package com.example.rabota.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rabota.R
import com.example.rabota.model.Question

class ChanceAdapter (val list:ArrayList<Question>):RecyclerView.Adapter<ChanceAdapter.ChanceViewholder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChanceViewholder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.iteam,parent,false)
        return ChanceViewholder(view)
    }

    override fun getItemCount()=list.size



    override fun onBindViewHolder(holder: ChanceViewholder, position: Int) {
        val textgreen=list[position]
        holder.apply {
            tvtext1.text=textgreen.text1
            tvtext2.text=textgreen.text2
        }
    }
    class ChanceViewholder(view:View):RecyclerView.ViewHolder(view){
        val tvtext1=view.findViewById<TextView>(R.id.tv_text1)
        val tvtext2=view.findViewById<TextView>(R.id.tv_text2)
    }
}