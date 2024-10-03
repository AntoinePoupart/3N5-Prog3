package org.poupart

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.poupart.databinding.ActivityContactBinding
import org.poupart.databinding.ActivityMainBinding

class ContactActivity : AppCompatActivity() {
    private lateinit var binding : ActivityContactBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i("Allo", "Mon super message yo!")
        title = "Contact"

        binding.buttonAccueil.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}