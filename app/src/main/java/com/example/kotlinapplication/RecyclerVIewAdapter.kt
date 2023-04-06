package com.example.kotlinapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class RecyclerVIewAdapter( private val Mlist:ArrayList<ListModel>): RecyclerView.Adapter<RecyclerVIewAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listimage = Mlist[position]

        holder.image.setImageResource(listimage.iamge)

    }

    override fun getItemCount(): Int {
        return Mlist.size
    }

    class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView) {

        val image = ItemView.findViewById<ImageView>(R.id.listImage)

    }
}