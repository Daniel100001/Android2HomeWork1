package com.example.android2homework1.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android2homework1.data.DataModel
import com.example.android2homework1.databinding.FragmentsItemBinding

class DogAdapter(private var listModel: MutableList<DataModel>) :
    RecyclerView.Adapter<DogAdapter.DogViewHolder>() {

    inner class DogViewHolder(private val binding: FragmentsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(dogModel: DataModel) {
            Glide.with(binding.imageItem).load(dogModel.image)
                .into(binding.imageItem)
            binding.textviewItem.text = dogModel.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = FragmentsItemBinding.inflate(inflater, parent, false)
        return DogViewHolder(binding)
    }

    override fun getItemCount(): Int = listModel.size

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        holder.onBind(listModel[position])
    }
}