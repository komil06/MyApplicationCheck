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


class SecondFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSecondBinding.inflate(inflater,container,false)
        binding.next1.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment2_to_thirdFragment)
        }
        binding.skip1.setOnClickListener {
            findNavController().navigate(R.id.action_secondFragment2_to_firstSignFragment)
        }
        return binding.root

    }


}