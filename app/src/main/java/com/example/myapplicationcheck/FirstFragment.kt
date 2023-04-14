package com.example.myapplicationcheck

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val handler = Handler()

        handler.postDelayed({
            findNavController().navigate(R.id.action_firstFragment2_to_secondFragment2)
        },2000)
        return inflater.inflate(R.layout.fragment_first, container, false)
    }


}