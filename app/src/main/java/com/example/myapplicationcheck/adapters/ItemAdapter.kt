package com.example.myapplicationcheck.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicationcheck.R
import com.example.myapplicationcheck.templates.Item



class ItemAdapter(var list4: MutableList<Item>): RecyclerView.Adapter<ItemAdapter.ItemHolder>(){

       class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val name: TextView = itemView.findViewById(R.id.rec_name)
        val imageView: ImageView = itemView.findViewById(R.id.rec_img)
        val location: TextView = itemView.findViewById(R.id.rec_location)
        val price: TextView = itemView.findViewById(R.id.rec_price)
       }

 override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ItemHolder {
  val holder = ItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.item4, parent, false))
  return holder
 }

 override fun onBindViewHolder(holder: ItemHolder, position: Int) {
  var item4 = list4[position]
  holder.name.text = item4.rec_name
  holder.imageView.setImageResource(item4.rec_img)
  holder.location.text = item4.rec_location
  holder.price.text = item4.rec_price
 }

 override fun getItemCount(): Int {
    return list4.size
 }

}