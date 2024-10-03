package org.poupart

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.poupart.databinding.ActivityArticleBinding
import org.poupart.databinding.ActivityMainBinding

class ArticleActivity : AppCompatActivity() {
    private lateinit var binding : ActivityArticleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityArticleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i("Allo", "Mon super message yo!")
        title = "Article"

        binding.buttonArticle.setOnClickListener {
            val intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }


    }
    }

