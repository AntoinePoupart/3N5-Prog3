package org.poupart


import adapters.VersionAdapter
import android.icu.text.CaseMap.Title
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import models.Version
import org.poupart.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var adapter: VersionAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i("Allo", "Mon super message yo!")
        title = "Versions"
        setupRecycler()
        fillRecycler()
    }
    private fun setupRecycler() {
        adapter = VersionAdapter() // Créer l'adapteur
        binding.rvMonAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvMonAdapter.setHasFixedSize(true) // Option pour améliorer les performances
        binding.rvMonAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.rvMonAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }
    private fun fillRecycler() {
        val items: MutableList<Version> = mutableListOf()

        items.add(Version("Android 1.0", "Petit Four"))
        items.add(Version("Android 1.5", "Cupcake"))
        items.add(Version("Android 2.0", "Eclair"))
        items.add(Version("Android 3.0", "Honeycomb"))
        items.add(Version("Android 4.0", "La cream sandwich"))
        items.add(Version("Android 5.0", "Lolipop"))


        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}
