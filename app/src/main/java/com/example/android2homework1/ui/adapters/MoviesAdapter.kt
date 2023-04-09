package com.example.android2homework1.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android2homework1.data.DataModel
import com.example.android2homework1.databinding.FragmentsItemBinding

class MoviesAdapter(private var listModel: MutableList<DataModel>) : RecyclerView.Adapter<MoviesAdapter.FirstViewHolder>() {

    inner class FirstViewHolder(private val binding: FragmentsItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(movieModel: DataModel) {
            Glide.with(binding.imageItem).load(movieModel.image).into(binding.imageItem)
            binding.textviewItem.text = movieModel.name

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = FragmentsItemBinding.inflate(inflater, parent, false)
        return FirstViewHolder(binding)
    }

    override fun getItemCount(): Int = listModel.size

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.onBind(listModel[position])
    }
}