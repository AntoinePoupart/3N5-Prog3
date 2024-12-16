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

    //Ne pas oublier de mettre dans le build.gradle.kts le
    //    buildFeatures{
    //        viewBinding = true
    //    }
    private lateinit var binding : ActivityMainBinding
    private lateinit var adapter: VersionAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i("Allo", "Mon super message yo!")
        title = "Versions"

    }

}
