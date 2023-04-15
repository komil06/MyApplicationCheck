package com.example.myapplicationcheck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.example.myapplicationcheck.databinding.FragmentNotifBinding


class NotifFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val binding = FragmentNotifBinding.inflate(inflater,container,false)
        binding.backnotif.setOnClickListener{
            findNavController().navigate(R.id.action_notifFragment_to_firstHomeFragment)
        }
        return binding.root
    }


}