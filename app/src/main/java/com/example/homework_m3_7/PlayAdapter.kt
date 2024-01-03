package com.example.homework_m3_7


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.homework_m3_7.databinding.ItemListBinding

class PlayAdapter(
    private val songs: ArrayList<Song>,
    private val onClick: (position: Int) -> Unit
): Adapter<ItemSongViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemSongViewHolder {
        return ItemSongViewHolder(
            ItemListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }



    override fun getItemCount() = songs.size

    override fun onBindViewHolder(holder: ItemSongViewHolder, position: Int) {
        holder.onBind(songs[position], position)
        holder.itemView.setOnClickListener { onClick(position) }
    }
}


