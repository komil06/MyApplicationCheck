package com.example.myapplicationcheck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.myapplicationcheck.adapters.BigItemAdapter
import com.example.myapplicationcheck.adapters.SmallItemAdapter
import com.example.myapplicationcheck.databinding.FragmentBookedBinding
import com.example.myapplicationcheck.templates.BigItem
import com.example.myapplicationcheck.templates.SmallItem


class BookedFragment : Fragment() {
    val list3 = mutableListOf<SmallItem>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentBookedBinding.inflate(inflater,container,false)
        binding.backbooked.setOnClickListener{
            findNavController().navigate(R.id.action_bookedFragment_to_firstHomeFragment)
        }
        binding.apps.setOnClickListener {
            findNavController().navigate(R.id.action_bookedFragment_to_bookmarkFragment)
        }

        list3.add(SmallItem(R.drawable.itemback1,false,"Emeralda De Hotel","Paris, France","$29/per night"))
        list3.add(SmallItem(R.drawable.itemback2,false,"President Hotel","Paris, France",  "$35/per nigth"))
        list3.add(SmallItem(R.drawable.itemback3,false,"Palms Casino","Amsterdam, Netherlands",  "$29/per nigth"))
        list3.add(SmallItem(R.drawable.itemback4,false,"Palazzo Versace","Rome, Italy  ",  "$36/per nigth"))
        list3.add(SmallItem(R.drawable.itemback5,false,"Bulgary Resort","Istanbul, Turkiye",  "$27/per nigth"))
        list3.add(SmallItem(R.drawable.itemback6,false,"President Hotel","Paris, France",  "$35/per nigth"))

        val adapter3 = SmallItemAdapter(list3,object:SmallItemAdapter.SmallItemInterface{
            override fun OnItemClick(smallItem: SmallItem) {

            }

        })

        binding.smallrv.adapter = adapter3




        return binding.root
    }


}