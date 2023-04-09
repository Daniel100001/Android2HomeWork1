package com.example.android2homework1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android2homework1.R
import com.example.android2homework1.databinding.FragmentDetailForMoviesBinding


class DetailFragmentForMovies : Fragment() {


    private lateinit var binding:FragmentDetailForMoviesBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailForMoviesBinding.inflate(inflater,container,false)
        return binding.root

    }

}