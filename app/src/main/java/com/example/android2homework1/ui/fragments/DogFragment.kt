package com.example.android2homework1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android2homework1.Repositories.DogRepository
import com.example.android2homework1.data.DataModel
import com.example.android2homework1.databinding.FragmentDogBinding
import com.example.android2homework1.ui.adapters.DogAdapter

class DogFragment : Fragment() {

    private var dogAdapter = DogAdapter()
    private var listModel: ArrayList<DataModel> = ArrayList()
    private val dogsRepository = DogRepository()
    private lateinit var binding: FragmentDogBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialization()
        setData()
    }

    private fun initialization() {
        binding.fragmentDogRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = dogAdapter
        }
    }

    private fun setData() {
        val cats = dogsRepository.getLisOfDogs()
        for (cat in cats) {
            val data = DataModel(cat.image, cat.name, cat.detail)
            listModel.add(data)
        }
        dogAdapter.setList(listModel)
    }

}