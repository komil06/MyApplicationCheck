package com.example.myapplicationcheck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.myapplicationcheck.adapters.BigItemAdapter
import com.example.myapplicationcheck.databinding.FragmentBigBinding
import com.example.myapplicationcheck.templates.BigItem


class BigFragment : Fragment() {





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentBigBinding.inflate(inflater,container,false)


        return binding.root
    }


}