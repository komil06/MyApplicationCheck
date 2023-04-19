package com.example.myapplicationcheck

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson

class MySharedPreference {

    companion object{
        private var mySharedPreference = MySharedPreference()
        private var myhotel: SharedPreferences? = null
        private lateinit var editor: SharedPreferences.Editor
        private var gson = Gson()

        fun  getInstance(context:Context):MySharedPreference{
            if (myhotel == null){
                myhotel = context.getSharedPreferences("myhotel",Context.MODE_PRIVATE)
            }
            return mySharedPreference
        }
    }
    fun getStatus():Boolean{
        return myhotel!!.getBoolean("status",false)
    }

//    fun setStatus(status: Boolean){
//        editor = myhotel!!.edit()
//        editor.putString("status",status).apply()
//    }
//
//    fun getUser():MutableList<User>{
//
//    }
}