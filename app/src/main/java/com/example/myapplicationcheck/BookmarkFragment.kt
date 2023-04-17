package com.example.myapplicationcheck

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myapplicationcheck.adapters.ItemAdapter
import com.example.myapplicationcheck.adapters.SmallItemAdapter
import com.example.myapplicationcheck.databinding.FragmentBookmarkBinding
import com.example.myapplicationcheck.templates.Item
import com.example.myapplicationcheck.templates.SmallItem


class BookmarkFragment : Fragment() {

    val list4 = mutableListOf<Item>()

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentBookmarkBinding.inflate(inflater,container,false)
        list4.add(Item(R.drawable.itemback1,"Emeralda De Hotel","Paris, France","$35/per night"))
        list4.add(Item(R.drawable.itemback2,"Palms Casino", "Amsterdam, Netherlands","$35/per nigth",))
        list4.add(Item(R.drawable.itemback3,"Palazzo Versacd", "Rome, Italy", "$29/per nigth"))
        list4.add(Item(R.drawable.itemback4,"De Paric Monte Carlo","Rome, Italy  ",  "$36/per nigth"))
        list4.add(Item(R.drawable.itemback5,"Grand Resort","Istanbul, Turkiye",  "$27/per nigth"))
        list4.add(Item(R.drawable.itemback6,"President Hotel","Paris, France",  "$35/per nigth"))
        list4.add(Item(R.drawable.itemback1,"Emeralda De Hotel","Paris, France","$29/per night"))
        list4.add(Item(R.drawable.itemback2,"President Hotel","Paris, France",  "$35/per nigth"))
        list4.add(Item(R.drawable.itemback3,"Palms Casino","Amsterdam, Netherlands",  "$29/per nigth"))
        list4.add(Item(R.drawable.itemback4,"Palazzo Versace","Rome, Italy  ",  "$36/per nigth"))
        list4.add(Item(R.drawable.itemback5,"Bulgary Resort","Istanbul, Turkiye",  "$27/per nigth"))
        list4.add(Item(R.drawable.itemback6,"President Hotel","Paris, France",  "$35/per nigth"))
        val adapter4 = ItemAdapter(list4)
        val layoutManager4 = GridLayoutManager(context,2,GridLayoutManager.VERTICAL,false)
        binding.rv3.adapter = adapter4
        binding.rv3.layoutManager = layoutManager4
          binding.backbookmark.setOnClickListener {
             findNavController().navigate( R.id.action_bookmarkFragment_to_firstHomeFragment)
          }
        binding.marked.setOnClickListener {
            findNavController().navigate(R.id.action_bookmarkFragment_to_bookedFragment)
        }
        return binding.root

}


    }
