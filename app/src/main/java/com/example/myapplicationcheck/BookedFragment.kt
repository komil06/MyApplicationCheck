package com.example.myapplicationcheck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplicationcheck.databinding.FragmentBookedBinding


class BookedFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentBookedBinding.inflate(inflater,container,false)
        binding.backbooked.setOnClickListener{
            findNavController().navigate(R.id.action_bookedFragment_to_firstHomeFragment)
        }

        return binding.root
    }


}