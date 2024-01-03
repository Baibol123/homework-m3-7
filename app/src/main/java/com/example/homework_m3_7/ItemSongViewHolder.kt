package com.example.homework_m3_7

import androidx.recyclerview.widget.RecyclerView
import com.example.homework_m3_7.databinding.ItemListBinding

class ItemSongViewHolder(private val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root) {
    fun onBind(song: Song, position: Int) {
        val minutes = song.length / 60
        val seconds = song.length % 60
        val formattedLength = String.format("%02d:%02d", minutes, seconds)

        binding.apply {
            songName.text = song.name
            artistName.text = song.artist
            songList.text = (position + 1).toString()
            songLength.text = formattedLength
        }
    }
}