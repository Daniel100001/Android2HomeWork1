package com.example.android2homework1.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android2homework1.data.DataModel
import com.example.android2homework1.databinding.FragmentsItemBinding

class CatAdapter(private val onItemClick : (dan: DataModel) -> Unit) :
    RecyclerView.Adapter<CatAdapter.CatViewHolder>() {

    private var list: List<DataModel> = ArrayList()

    fun setList(list: List<DataModel>) {
        this.list = list
        notifyDataSetChanged()
    }

    inner class CatViewHolder(private val binding: FragmentsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener(){
                onItemClick(list[adapterPosition])
            }
        }


        fun onBind(catModel: DataModel) {
            Glide.with(binding.imageItem).load(catModel.image)
                .into(binding.imageItem)
            binding.textviewItem.text = catModel.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        return CatViewHolder(
            FragmentsItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        holder.onBind(list[position])
    }
}