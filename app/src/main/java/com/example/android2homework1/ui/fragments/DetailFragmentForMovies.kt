package com.example.android2homework1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.android2homework1.databinding.FragmentDetailForMoviesBinding


class DetailFragmentForMovies : Fragment() {
    
    private lateinit var binding:FragmentDetailForMoviesBinding
    private val args by navArgs<DetailFragmentForMoviesArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailForMoviesBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData() {
        val data = args.myModel.detail
        binding.textDetailFragment.text = data
        let { Glide.with(it).load(args.myModel.image).into(binding.imageDetailFragment) }
       }
}