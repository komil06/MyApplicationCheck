package com.example.myapplicationcheck

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplicationcheck.databinding.FragmentFourthBinding
import com.example.myapplicationcheck.databinding.FragmentThirdBinding

class FourthFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFourthBinding.inflate(inflater,container,false)
        binding.next3.setOnClickListener {
            findNavController().navigate(R.id.action_fourthFragment_to_firstSignFragment)
        }
        binding.skip3.setOnClickListener {
            findNavController().navigate(R.id.action_fourthFragment_to_firstSignFragment)
        }
        return binding.root
    }


}