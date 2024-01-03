package com.example.homework_m3_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework_m3_7.databinding.FragmentSecondBinding


class SecondFragment  (
    private val listSongs: ArrayList<Song>,
    private val onClick: (position: Int) -> Unit
)  : Fragment() {
        private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.playlist.adapter = PlayAdapter(listSongs, onClick)

    }

//    fun setSong(selectedSong: Song) {
//        TODO("Not yet implemented")
//    }
}
