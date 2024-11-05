package org.poupart

import adapters.MonAdapter
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import models.Album
import org.poupart.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var adapter: MonAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i("Allo", "Mon super message yo!")
        setupRecycler()
        fillRecycler()
    }
    private fun setupRecycler() {
        adapter = MonAdapter() // Créer l'adapteur
        binding.rvMonAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvMonAdapter.setHasFixedSize(true) // Option pour améliorer les performances
//        binding.rvMonAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
//            DividerItemDecoration(
//                binding.rvMonAdapter.context, DividerItemDecoration.VERTICAL
//            )
//        )
    }

    private fun fillRecycler() {
//        val items: MutableList<String> = mutableListOf()
//        for (i in 1..6) {
//            items.add("Item #$i")
//        }
        val items: MutableList<Album> = mutableListOf(
            Album(id = 1, name="Opium Dreams", artistName = "Homixide Gang"),
            Album(id = 2, name = "Whole lotta red", artistName = "Playboi Carti"),
            Album(id = 3, name="Love Last Forever", artistName = "Destroy Lonely"),
            Album(id = 4, name="Luv is Rage 2", artistName = "Lil Uzi Vert"),
            Album(id = 5, name="No Stylist", artistName = "Destroy Lonely"),
            Album(id = 6, name="World On Fire", artistName = "Lancey Foux"),
            Album(id = 7, name="Astroworld", artistName = "Travis Scott")
        )
        //val album = mutableListOf(

//            "Antigéographiquement",
//            "Whole lotta red",
//            "Love Last Forever",
//            "A Great Chaos",
//            "Die Lit"
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }
}
