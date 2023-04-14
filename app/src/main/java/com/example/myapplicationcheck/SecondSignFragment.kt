package com.example.myapplicationcheck

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController


class SecondSignFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Handler(Looper.myLooper()!!).postDelayed({
            findNavController().navigate(R.id.action_secondSignFragment_to_thirdSignFragment)

        }, 2000)
        return inflater.inflate(R.layout.fragment_second_sign, container, false)
    }



}