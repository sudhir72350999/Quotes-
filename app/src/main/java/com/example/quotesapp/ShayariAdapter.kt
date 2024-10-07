package com.example.quotesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ShayariAdapter(private val shayariList: List<Shayari>) : RecyclerView.Adapter<ShayariAdapter.ShayariViewHolder>() {

    inner class ShayariViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvShayari: TextView = itemView.findViewById(R.id.tvShayari)
        val tvAuthor: TextView = itemView.findViewById(R.id.tvAuthor)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShayariViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_shayari, parent, false)
        return ShayariViewHolder(view)
    }

    override fun onBindViewHolder(holder: ShayariViewHolder, position: Int) {
        val shayari = shayariList[position]
        holder.tvShayari.text = shayari.text
        holder.tvAuthor.text = shayari.author ?: "Unknown"
    }

    override fun getItemCount(): Int {
        return shayariList.size
    }
}
