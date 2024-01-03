package com.example.homework_m3_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework_m3_7.databinding.FragmentMainBinding

class MainFragment(song: Song) : Fragment() {
    private lateinit var binding: FragmentMainBinding
    private var song: Song? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    fun setSong(song: Song) {
        binding.apply {
            songName.text = song.name
            artistName.text = song.artist
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        song?.let { setSong(it) }
    }
}