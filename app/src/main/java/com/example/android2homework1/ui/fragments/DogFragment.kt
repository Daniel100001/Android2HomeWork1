package com.example.android2homework1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android2homework1.databinding.FragmentDogBinding

class DogFragment : Fragment() {

    private lateinit var binding: FragmentDogBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDogBinding.inflate(inflater,container,false)
        return binding.root
    }
}