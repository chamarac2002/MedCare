package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class shedules : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_shedules)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button9 = findViewById<Button>(R.id.button9)
        button9.setOnClickListener {
            val intent1 = Intent (this, add_shedule::class.java)
            startActivity(intent1)
        }

        val imageView7 = findViewById<ImageView>(R.id.imageView7)
        imageView7.setOnClickListener {
            val intent1 = Intent (this, home::class.java)
            startActivity(intent1)
        }

        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        imageView3.setOnClickListener {
            val intent1 = Intent (this, profile::class.java)
            startActivity(intent1)
        }

        val imageView5 = findViewById<ImageView>(R.id.imageView5)
        imageView5.setOnClickListener {
            val intent1 = Intent (this, login::class.java)
            startActivity(intent1)
        }

        val imageView8 = findViewById<ImageView>(R.id.imageView8)
        imageView8.setOnClickListener {
            val intent1 = Intent (this, home::class.java)
            startActivity(intent1)
        }
    }
}