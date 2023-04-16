package com.example.myapplicationcheck

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.myapplicationcheck.databinding.FragmentSecondSignBinding
import com.example.myapplicationcheck.databinding.FragmentThirdSignBinding


class ThirdSignFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentThirdSignBinding.inflate(inflater,container,false)
        binding.back2.setOnClickListener {
            findNavController().navigate(R.id.action_thirdSignFragment_to_secondSignFragment)
        }
        binding.registerButton.setOnClickListener {
            findNavController().navigate(R.id.action_thirdSignFragment_to_fourthSignFragment)
        }





        return binding.root
    }

}

