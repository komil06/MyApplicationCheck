package com.example.myapplicationcheck

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplicationcheck.databinding.FragmentSecondBinding
import com.example.myapplicationcheck.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentThirdBinding.inflate(inflater,container,false)
        binding.next2.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_fourthFragment)
        }
        binding.skip2.setOnClickListener {
            findNavController().navigate(R.id.action_thirdFragment_to_firstSignFragment)
        }
        return binding.root
    }



}