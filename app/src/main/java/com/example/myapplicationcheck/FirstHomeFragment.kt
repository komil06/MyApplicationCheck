package com.example.myapplicationcheck

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.myapplicationcheck.adapters.BigItemAdapter
import com.example.myapplicationcheck.adapters.ItemAdapter
import com.example.myapplicationcheck.adapters.SmallItemAdapter
import com.example.myapplicationcheck.databinding.FragmentFirstHomeBinding
import com.example.myapplicationcheck.templates.BigItem
import com.example.myapplicationcheck.templates.Item
import com.example.myapplicationcheck.templates.SmallItem


class FirstHomeFragment : Fragment() {
   val list= mutableListOf<BigItem>()
   val list2= mutableListOf<SmallItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        val binding = FragmentFirstHomeBinding.inflate(inflater,container,false)

//            val popupMenu = PopupMenu(requireContext(), binding.booked)
//
//            popupMenu.menuInflater.inflate(R.menu.bottom_menu, popupMenu.menu)
//            popupMenu.setOnMenuItemClickListener { menuItem ->
//                Toast.makeText(requireContext(), "You Clicked " + menuItem.title, Toast.LENGTH_SHORT).show()
//                true
//            }
//            popupMenu.show()
//            true




        binding.notif.setOnClickListener{
            findNavController().navigate(R.id.action_firstHomeFragment_to_notifFragment)
        }
        binding.seeall.setOnClickListener {
            findNavController().navigate(R.id.action_firstHomeFragment_to_bookedFragment)
        }
        binding.booked.setOnClickListener {
            findNavController().navigate(R.id.action_firstHomeFragment_to_bookmarkFragment)
        }


        list.add(BigItem(R.drawable.itemback1,false,"Emeralda De Hotel","Paris, France","$29/per night"))
        list.add(BigItem(R.drawable.itemback2,false,"President Hotel","Paris, France",  "$35/per nigth"))
        list.add(BigItem(R.drawable.itemback3,false,"Palms Casino","Amsterdam, Netherlands",  "$29/per nigth"))
        list.add(BigItem(R.drawable.itemback4,false,"Palazzo Versace","Rome, Italy  ",  "$36/per nigth"))
        list.add(BigItem(R.drawable.itemback5,false,"Bulgary Resort","Istanbul, Turkiye",  "$27/per nigth"))
        list.add(BigItem(R.drawable.itemback6,false,"President Hotel","Paris, France",  "$35/per nigth"))

        val adapter = BigItemAdapter(list,object:BigItemAdapter.BigItemInterface{
            override fun OnItemClick(bigItem: BigItem) {
                var bundle = bundleOf("bigitem" to bigItem)
                findNavController().navigate(R.id.action_firstHomeFragment_to_smallFragment, bundle)
            }

        })
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        binding.rv1.adapter = adapter
        binding.rv1.layoutManager = layoutManager


        list2.add(SmallItem(R.drawable.itemback1,false,"Emeralda De Hotel","Paris, France","$29/per night"))
        list2.add(SmallItem(R.drawable.itemback2,false,"President Hotel","Paris, France",  "$35/per nigth"))
        list2.add(SmallItem(R.drawable.itemback3,false,"Palms Casino","Amsterdam, Netherlands",  "$29/per nigth"))
        list2.add(SmallItem(R.drawable.itemback4,false,"Palazzo Versace","Rome, Italy  ",  "$36/per nigth"))
        list2.add(SmallItem(R.drawable.itemback5,false,"Bulgary Resort","Istanbul, Turkiye",  "$27/per nigth"))
        list2.add(SmallItem(R.drawable.itemback6,false,"President Hotel","Paris, France",  "$35/per nigth"))
        val adapter2 = SmallItemAdapter(list2,object :SmallItemAdapter.SmallItemInterface{
            override fun OnItemClick(smallItem: SmallItem) {
                var bundle = bundleOf("smallitem" to smallItem)
                findNavController().navigate(R.id.action_firstHomeFragment_to_smallFragment,bundle)
            }
        })
        val layoutManager2 = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.rv2.adapter = adapter2
        binding.rv2.layoutManager = layoutManager2



        binding.bottomNavigationView.setOnItemSelectedListener{
            when (it.itemId) {
                R.id.home -> {


                }
                R.id.booking -> {
                    findNavController().navigate(R.id.action_firstHomeFragment_to_bookedFragment)

                }
                R.id.profile ->{
                    findNavController().navigate(R.id.action_firstHomeFragment_to_profileFragment)
                }
            }
            true
        }


        return binding.root


    }

//    fun loadFragment(fragment: Fragment){
//        val transaction = parentFragmentManager.beginTransaction()
//        transaction.replace(R.id.container,fragment)
//        transaction.commit()
//    }


}