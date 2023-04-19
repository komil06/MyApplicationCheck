package com.example.myapplicationcheck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.myapplicationcheck.databinding.FragmentSmallBinding
import com.example.myapplicationcheck.templates.BigItem
import com.example.myapplicationcheck.templates.SmallItem


class SmallFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSmallBinding.inflate(inflater,container,false)
        val bigItem = arguments?.getSerializable("bigitem") as BigItem
        binding.hotelName.text=bigItem.name
        binding.imageView6.setImageResource(bigItem.background)
        binding.bookPrice.text = bigItem.price
        binding.hotelLoc.text = bigItem.location
        binding.hotelDes.text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras nisi nisl, aliquet bibendum pharetra at, dapibus a metus. Phasellus consequat odio ac laoreet elementum. Fusce cursus blandit vestibulum. Pellentesque ac lobortis elit, vel venenatis sem. Aliquam erat erat, auctor non aliquam vel, aliquet pharetra mi. Duis sit amet ultricies magna. Sed imperdiet nibh in nulla luctus, eu cursus tortor vehicula. In iaculis, dolor eu facilisis consequat, magna justo efficitur tortor, ut porttitor ligula augue et mi. Maecenas condimentum, tellus ut sodales ultricies, nibh leo tempor augue, et lacinia lectus leo tempor nulla."
        binding.bookButton.setOnClickListener {
          var  toast = Toast.makeText(context,"You Booked!",Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }


}