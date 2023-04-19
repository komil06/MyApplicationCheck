package com.example.myapplicationcheck.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplicationcheck.R
import com.example.myapplicationcheck.templates.BigItem

class BigItemAdapter(var list:MutableList<BigItem>, var bigItemInterface:BigItemInterface) : RecyclerView.Adapter<BigItemAdapter.BigItemHolder>() {

    class BigItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var name:TextView = itemView.findViewById(R.id.itemtext)
        var location:TextView = itemView.findViewById(R.id.location)
        var price:TextView = itemView.findViewById(R.id.price)
        var mark :ImageView = itemView.findViewById(R.id.mark)
        var background:ImageView = itemView.findViewById(R.id.background)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BigItemHolder {
        var holder  = BigItemHolder(LayoutInflater.from(parent.context).inflate(R.layout.fragment_big,parent,false))
        return holder
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: BigItemHolder, position: Int) {
        var item = list[position]
        holder.name.text = item.name
        holder.background.setImageResource(item.background)
        holder.location.text = item.location
        holder.mark.tag = item.mark
        holder.price.text = item.price
        holder.itemView.setOnClickListener{
            bigItemInterface.OnItemClick(item)
        }

    }
    interface BigItemInterface{
        fun OnItemClick(bigItem: BigItem)


    }
}