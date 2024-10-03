package org.poupart

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.poupart.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Accueil"
        Log.i("Allo", "Mon super message yo!")
        // On réagit au clic sur un bouton
        binding.buttonArticle.setOnClickListener {
            // On crée l'intent, qui a besoin :
            // 1. Du contexte actuel
            // 2. De la classe d'activité à démarrer.
            val intent = Intent(this, ArticleActivity::class.java)

            // On démarre l'activité en lui passant l'intent qu'on vient de créer.
            startActivity(intent)
        }
        binding.buttonContact.setOnClickListener {
            val intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }
    }


}