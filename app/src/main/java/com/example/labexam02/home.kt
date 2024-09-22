package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent1 = Intent (this, shedules::class.java)
            startActivity(intent1)
        }

        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            val intent1 = Intent (this, inventory::class.java)
            startActivity(intent1)
        }

        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener {
            val intent1 = Intent (this, symptom::class.java)
            startActivity(intent1)
        }

        val button8 = findViewById<Button>(R.id.button8)
        button8.setOnClickListener {
            val intent1 = Intent (this, vital::class.java)
            startActivity(intent1)
        }

        val button15 = findViewById<Button>(R.id.button15)
        button15.setOnClickListener {
            val intent1 = Intent (this, medication_information::class.java)
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
    }
}