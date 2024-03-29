package com.example.homework_m3_7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_m3_7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val listSongs = ArrayList<Song>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (listSongs.isEmpty()) {
            loadData(listSongs)
        }

        setupFragments()
    }
    private fun setupFragments() {
        val mainFragment = MainFragment(listSongs[0])
        val secondFragment = SecondFragment(listSongs, this::onClick)

        supportFragmentManager.beginTransaction()
            .add(binding.mainContainer.id, mainFragment)
            .commit()

        supportFragmentManager.beginTransaction()
            .add(binding.secondContainer.id, secondFragment)
            .commit()
    }
    private fun onClick(position: Int) {
        val intent = Intent(this, NextActivity::class.java)
        intent.putExtra(SONG, listSongs[position])
        (supportFragmentManager.findFragmentById(binding.mainContainer.id) as MainFragment).setSong(listSongs[position])
        startActivity(intent)
    }

    private fun loadData(listSongs: ArrayList<Song>) {
        this.listSongs.apply {
            add(Song("Last Christmas", "Wham", 150))
            add(Song("Raise Your Glass", "P!nk", 108))
            add(Song("Happy Xmas (War Is Over)", "John Lennon", 150))
            add(Song("Feliz Navidad", "Jose Feliciano", 290))
            add(Song("Jingle Bell Rock", "Bobby Helms", 120))
            add(Song("The Parting Glass", "Hozier", 177))
            add(Song("Wonderful Christmastime", "Paul McCartney", 222))
            add(Song("Happy New Year", "Judy Garland", 222))
            add(Song("Do They Know It's Christmas?", "Band Aid", 199))
            add(Song("Funky New Year", "Eagles", 188))
        }
    }
    
    companion object {
        const val SONG = "KEY1"
    }

}
