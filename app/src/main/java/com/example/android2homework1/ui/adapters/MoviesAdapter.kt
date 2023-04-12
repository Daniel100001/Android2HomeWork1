package com.example.android2homework1.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android2homework1.data.DataModel
import com.example.android2homework1.databinding.FragmentsItemBinding

class MoviesAdapter :
    RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {

    private var list: List<DataModel> = ArrayList()

    fun setList(list: List<DataModel>) {
        this.list = list
        notifyDataSetChanged()
    }

    inner class MoviesViewHolder(private val binding: FragmentsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(movieModel: DataModel) {
            Glide.with(binding.imageItem).load(movieModel.image).into(binding.imageItem)
            binding.textviewItem.text = movieModel.name

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        return MoviesViewHolder(
            FragmentsItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.onBind(list[position])
    }
}