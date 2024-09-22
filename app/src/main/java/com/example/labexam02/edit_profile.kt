package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class edit_profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_edit_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button12 = findViewById<Button>(R.id.button12)
        button12.setOnClickListener {
            val intent1 = Intent (this, profile::class.java)
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

        val imageView10 = findViewById<ImageView>(R.id.imageView10)
        imageView10.setOnClickListener {
            val intent1 = Intent (this, profile::class.java)
            startActivity(intent1)
        }
    }
}