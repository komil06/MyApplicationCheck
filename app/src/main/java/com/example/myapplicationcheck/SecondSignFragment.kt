package com.example.myapplicationcheck

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.example.myapplicationcheck.databinding.FragmentFirstSignBinding
import com.example.myapplicationcheck.databinding.FragmentSecondSignBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class SecondSignFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSecondSignBinding.inflate(inflater,container,false)

        var userList = mutableListOf<User>()
        var type = object : TypeToken<List<User>>() {}.type
        var gson = Gson()

        var getSharedPreference = requireActivity().getSharedPreferences("login",AppCompatActivity.MODE_PRIVATE)
        var edit = getSharedPreference.edit()


        binding.registerButton.setOnClickListener {
            if (binding.textInputLayout1.text!!.isEmpty() || binding.textInputEditText.text!!.isEmpty()){
                Toast.makeText(requireContext(),"Full all Strokes", Toast.LENGTH_SHORT).show()
            }else{
                var user_email = binding.textInputLayout1.text.toString()
                var user_password = binding.textInputEditText.text.toString()
                 var str = getSharedPreference.getString("users","")

                if (str == ""){
                    userList = mutableListOf<User>()
                }else{
                    userList = gson.fromJson(str, type)
                }
                userList.add(User(user_email,user_password))
                var s = gson.toJson(userList)
                edit.putString("Users", s).commit()
                findNavController().navigate(R.id.action_secondSignFragment_to_firstHomeFragment)
            }



        }

        binding.back1.setOnClickListener {
            findNavController().navigate(R.id.action_secondSignFragment_to_firstSignFragment)
        }


        return binding.root
    }



}