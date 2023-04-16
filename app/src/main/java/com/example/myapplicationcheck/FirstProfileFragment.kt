package com.example.myapplicationcheck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplicationcheck.databinding.FragmentFirstProfileBinding


class FirstProfileFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFirstProfileBinding.inflate(inflater,container,false)
        binding.textInputEditTextLogout.setOnClickListener {
            findNavController().navigate(R.id.action_firstProfileFragment_to_firstSignFragment)
        }
        return binding.root
    }


    }
