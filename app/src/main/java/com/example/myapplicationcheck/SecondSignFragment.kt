package com.example.myapplicationcheck

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplicationcheck.databinding.FragmentFirstSignBinding
import com.example.myapplicationcheck.databinding.FragmentSecondSignBinding


class SecondSignFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSecondSignBinding.inflate(inflater,container,false)
        binding.registerButton.setOnClickListener {
            findNavController().navigate(R.id.action_secondSignFragment_to_thirdSignFragment)
        }
        binding.login.setOnClickListener {
            findNavController().navigate(R.id.action_secondSignFragment_to_fourthSignFragment)
        }
        binding.back1.setOnClickListener{
            findNavController().navigate(R.id.action_secondSignFragment_to_firstSignFragment)
        }


        return binding.root
    }



}