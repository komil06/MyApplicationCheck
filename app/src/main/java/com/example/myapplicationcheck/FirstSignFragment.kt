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


class FirstSignFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFirstSignBinding.inflate(inflater,container,false)

        binding.register.setOnClickListener {
            findNavController().navigate(R.id.action_firstSignFragment_to_secondSignFragment)
        }

       binding.loginButton.setOnClickListener {
           findNavController().navigate(R.id.action_firstSignFragment_to_fourthSignFragment)
       }

        return binding.root
    }


}