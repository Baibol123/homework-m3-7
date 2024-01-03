package com.example.homework_m3_7

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.homework_m3_7.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNextBinding

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.songName.text =
            intent.getSerializableExtra(MainActivity.SONG, Song::class.java)?.name
    }
}