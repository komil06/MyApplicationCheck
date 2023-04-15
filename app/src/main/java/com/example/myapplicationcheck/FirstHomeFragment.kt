package com.example.myapplicationcheck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.myapplicationcheck.adapters.BigItemAdapter
import com.example.myapplicationcheck.adapters.SmallItemAdapter
import com.example.myapplicationcheck.databinding.FragmentFirstHomeBinding
import com.example.myapplicationcheck.templates.BigItem
import com.example.myapplicationcheck.templates.SmallItem


class FirstHomeFragment : Fragment() {
   val list= mutableListOf<BigItem>()
   val list2= mutableListOf<SmallItem>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFirstHomeBinding.inflate(inflater,container,false)

        list.add(BigItem(R.drawable.itemback1,false,"Emeralda De Hotel","Paris, France","$29/per night"))
        list.add(BigItem(R.drawable.itemback2,false,"President Hotel","Paris, France",  "$35/per nigth"))
        list.add(BigItem(R.drawable.itemback3,false,"Palms Casino","Amsterdam, Netherlands",  "$29/per nigth"))
        list.add(BigItem(R.drawable.itemback4,false,"Palazzo Versace","Rome, Italy  ",  "$36/per nigth"))
        list.add(BigItem(R.drawable.itemback5,false,"Bulgary Resort","Istanbul, Turkiye",  "$27/per nigth"))
        list.add(BigItem(R.drawable.itemback6,false,"President Hotel","Paris, France",  "$35/per nigth"))
        val adapter = BigItemAdapter(list)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rv1.adapter = adapter
        binding.rv1.layoutManager = layoutManager


        list2.add(SmallItem(R.drawable.itemback1,false,"Emeralda De Hotel","Paris, France","$29/per night"))
        list2.add(SmallItem(R.drawable.itemback2,false,"President Hotel","Paris, France",  "$35/per nigth"))
        list2.add(SmallItem(R.drawable.itemback3,false,"Palms Casino","Amsterdam, Netherlands",  "$29/per nigth"))
        list2.add(SmallItem(R.drawable.itemback4,false,"Palazzo Versace","Rome, Italy  ",  "$36/per nigth"))
        list2.add(SmallItem(R.drawable.itemback5,false,"Bulgary Resort","Istanbul, Turkiye",  "$27/per nigth"))
        list2.add(SmallItem(R.drawable.itemback6,false,"President Hotel","Paris, France",  "$35/per nigth"))
        val adapter2 = SmallItemAdapter(list2)
        val layoutManager2 = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.rv2.adapter = adapter2
        binding.rv2.layoutManager = layoutManager2

        return binding.root
    }


}