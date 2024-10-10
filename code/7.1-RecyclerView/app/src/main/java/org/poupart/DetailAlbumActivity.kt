package org.poupart

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.poupart.databinding.ActivityDetailAlbumBinding

class DetailAlbumActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailAlbumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailAlbumBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Récupérer les extras envoyés par l'intent
        val albumName = intent.getStringExtra("albumName")
        val artistName = intent.getStringExtra("albumArtist")

        // Afficher les données dans les TextViews
        binding.albumDetailName.text = albumName
        binding.artistDetailName.text = artistName
    }
}