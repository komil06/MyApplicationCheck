package com.example.myapplicationcheck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import androidx.navigation.fragment.findNavController
import com.example.myapplicationcheck.databinding.FragmentFourthSignBinding
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


class FourthSignFragment : Fragment() {





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var userList = mutableListOf<User>()
        var type = object : TypeToken<List<User>>(){}.type
        var gson = Gson()
        var getPreferences = requireActivity().getSharedPreferences("login", AppCompatActivity.MODE_PRIVATE)
        var str = getPreferences.getString("Users", "")
        if (str ==""){

        }else{
            userList = gson.fromJson(str, type)
        }
        val binding = FragmentFourthSignBinding.inflate(inflater,container,false)
        binding.back2.setOnClickListener{
           findNavController().navigate(R.id.action_fourthSignFragment_to_firstSignFragment)
        }
        binding.login2.setOnClickListener {
            findNavController().navigate(R.id.action_fourthSignFragment_to_secondSignFragment)
        }
        binding.registerButton2.setOnClickListener {
            if (binding.email.text!!.isEmpty() || binding.password.text!!.isEmpty()){
                    Toast.makeText(requireContext(), "Enter email or password", Toast.LENGTH_LONG).show()
            }
            else{

                   var a = 0
                    for (i in 0..userList.size-1){
                        if (userList[i].email==binding.email.text.toString() && userList[i].password==binding.password.text.toString()){
                            a=1
                        }
                    }
                    if (a==1){
                        findNavController().navigate(R.id.action_fourthSignFragment_to_firstHomeFragment)
                    }else{
                        Toast.makeText(requireContext(), "Wrong email or password", Toast.LENGTH_LONG).show()
                    }
                }

            }




        //
        //binding.signin.setOnClickListener{
        //    if (binding.emailrgstrlog1.text!!.isEmpty()){
        //        Toast.makeText(requireContext(), "Enter email", Toast.LENGTH_LONG).show()
        //    }else{
        //        if (binding.passwordrgstrlog1.text!!.isEmpty()){
        //            Toast.makeText(requireContext(), "Enter password", Toast.LENGTH_LONG).show()
        //        }else{
        //            var a = 0
        //            for (i in 0..userList.size-1){
        //                if (userList[i].email==binding.emailrgstrlog1.text.toString() && userList[i].password==binding.passwordrgstrlog1.text.toString()){
        //                    a=1
        //                }
        //            }
        //            if (a==1){
        //                findNavController().navigate(R.id.action_loginFragment2_to_selectcountFragment)
        //            }else{
        //                Toast.makeText(requireContext(), "Wrong email or password", Toast.LENGTH_LONG).show()
        //            }
        //        }
        //    }
        //}


        return binding.root
    }
    }


