package org.poupart

import adapters.VersionAdapter
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import org.poupart.databinding.ActivityDetailVersionBinding
import org.poupart.databinding.ActivityMainBinding

class DetailVersion : AppCompatActivity() {

    //Changer le bon activity
    private lateinit var binding : ActivityDetailVersionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailVersionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Récupérer les extras envoyés par l'intent
        val version = intent.getStringExtra("version")
        val nomVersion = intent.getStringExtra("nomVersion")

        // Afficher les données dans les TextViews (prendre même nom que dans le xml)
        binding.versionDetail.text = version
        binding.nomVersionDetail.text = nomVersion

        title="Versions"

    }
}