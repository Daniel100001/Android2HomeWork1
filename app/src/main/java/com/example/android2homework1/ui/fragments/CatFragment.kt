package com.example.android2homework1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android2homework1.Repositories.CatsRepository
import com.example.android2homework1.data.DataModel
import com.example.android2homework1.databinding.FragmentCatBinding
import com.example.android2homework1.ui.adapters.CatAdapter


class CatFragment : Fragment() {

    private var catAdapter = CatAdapter(this::onItemClick)
    private var list: ArrayList<DataModel> = ArrayList()
    private val catsRepository = CatsRepository()

    private fun onItemClick(dan: DataModel) {
        TODO("Not yet implemented")
    }

    private lateinit var binding: FragmentCatBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCatBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialization()
        setData()
    }



    private fun initialization() {
        binding.fragmentCatRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = catAdapter

        }
    }
    private fun setData() {
        list.add(DataModel(catsRepository.getListOfCats()))
        catAdapter.setList(list)
    }
}



