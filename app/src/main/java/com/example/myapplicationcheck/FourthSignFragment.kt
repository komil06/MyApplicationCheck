package com.example.myapplicationcheck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.navigation.fragment.findNavController
import com.example.myapplicationcheck.databinding.FragmentFourthSignBinding


class FourthSignFragment : Fragment() {





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFourthSignBinding.inflate(inflater,container,false)
        binding.back2.setOnClickListener{
            findNavController().navigate(R.id.action_fourthSignFragment_to_thirdSignFragment)
        }
        binding.registerButton2.setOnClickListener {
            findNavController().navigate(R.id.action_fourthSignFragment_to_firstHomeFragment)
        }


        return binding.root
    }
    }


