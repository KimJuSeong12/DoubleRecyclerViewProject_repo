package com.example.doublerecyclerviewproject

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.doublerecyclerviewproject.databinding.SubitemListBinding

class ListAdapter2(val data:MutableList<DataSub>):RecyclerView.Adapter<ListAdapter2.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val binding: SubitemListBinding = SubitemListBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return CustomViewHolder(binding)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val binding = holder.binding
        binding.tvName2.text = data[position].name
        Log.e("ListAdapter2", "${data[position].name}")
        binding.ivPicture.setImageResource(data[position].imgData)
    }

    class CustomViewHolder(val binding: SubitemListBinding) : RecyclerView.ViewHolder(binding.root)

}