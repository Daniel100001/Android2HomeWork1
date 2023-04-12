package com.example.android2homework1.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android2homework1.Repositories.MoviesRepository
import com.example.android2homework1.data.DataModel
import com.example.android2homework1.databinding.FragmentMovieBinding
import com.example.android2homework1.ui.adapters.MoviesAdapter


class MoviesFragment : Fragment() {

    private var moviesAdapter = MoviesAdapter()
    private var listModel: ArrayList<DataModel> = ArrayList()
    private val moviesRepository = MoviesRepository()
    private lateinit var binding: FragmentMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMovieBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialization()
        setData()
    }

    private fun initialization() {
        binding.fragmentMoviesRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = moviesAdapter
        }
    }

    private fun setData() {
        val cats = moviesRepository.getListOfData()
        for (cat in cats) {
            val data = DataModel(cat.image, cat.name, cat.detail)
            listModel.add(data)
        }
        moviesAdapter.setList(listModel)
    }
}


