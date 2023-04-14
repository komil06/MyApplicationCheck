package com.example.myapplicationcheck

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController


class SecondFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Handler(Looper.myLooper()!!).postDelayed({
            findNavController().navigate(R.id.action_secondFragment2_to_thirdFragment)

        }, 2000)
        return inflater.inflate(R.layout.fragment_second, container, false)
    }


}