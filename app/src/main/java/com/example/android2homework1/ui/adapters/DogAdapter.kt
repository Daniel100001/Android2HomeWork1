package com.example.android2homework1.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android2homework1.data.DataModel
import com.example.android2homework1.databinding.FragmentsItemBinding

class DogAdapter :
    RecyclerView.Adapter<DogAdapter.DogViewHolder>() {

    private var list: List<DataModel> = ArrayList()

    fun setList(list: List<DataModel>) {
        this.list = list
        notifyDataSetChanged()
    }

    inner class DogViewHolder(private val binding: FragmentsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(dogModel: DataModel) {
            Glide.with(binding.imageItem).load(dogModel.image)
                .into(binding.imageItem)
            binding.textviewItem.text = dogModel.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        return DogViewHolder(
            FragmentsItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        holder.onBind(list[position])
    }
}