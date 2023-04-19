package com.example.myapplicationcheck.adapters


import android.provider.ContactsContract.CommonDataKinds.Im
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicationcheck.R
import com.example.myapplicationcheck.templates.BigItem
import com.example.myapplicationcheck.templates.SmallItem

class SmallItemAdapter(var list2:MutableList<SmallItem>,var smallItemInterface: SmallItemInterface): RecyclerView.Adapter<SmallItemAdapter.SmallItemHolder>(){

    class SmallItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val name:TextView = itemView.findViewById(R.id.hotel_name)
        val imageView:ImageView = itemView.findViewById(R.id.hotel_img)
        val mark:ImageView = itemView.findViewById(R.id.bookmark)
        val location:TextView = itemView.findViewById(R.id.hotel_loc)
        val price:TextView = itemView.findViewById(R.id.price2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SmallItemHolder {
           val holder = SmallItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.item2,parent,false))
           return holder
    }

    override fun getItemCount(): Int {
       return list2.size
    }

    override fun onBindViewHolder(holder: SmallItemHolder, position: Int) {
        var item2 = list2[position]
        holder.name.text = item2.name
        holder.imageView.setImageResource(item2.imageView)
        holder.location.text = item2.location
        holder.mark.tag = item2.mark
        holder.price.text = item2.price



    }

    interface SmallItemInterface{
        fun OnItemClick(smallItem: SmallItem)
    }
}