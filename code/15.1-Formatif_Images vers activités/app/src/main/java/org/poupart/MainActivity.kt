package org.poupart

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import org.poupart.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i("Allo", "Mon super message yo!")
        title="Yo Mama"
        }
    }
