package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class add_shedule : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_shedule)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val spinner1: Spinner = findViewById(R.id.spinner1)
        ArrayAdapter.createFromResource(
            this,
            R.array.dropdown_items_1,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner1.adapter = adapter
        }

        val spinner2: Spinner = findViewById(R.id.spinner2)
        ArrayAdapter.createFromResource(
            this,
            R.array.dropdown_items_2,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner2.adapter = adapter
        }

        val spinner3: Spinner = findViewById(R.id.spinner3)
        ArrayAdapter.createFromResource(
            this,
            R.array.dropdown_items_3,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner3.adapter = adapter
        }

        val button10 = findViewById<Button>(R.id.button10)
        button10.setOnClickListener {
            val intent1 = Intent (this, shedules::class.java)
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

        val imageView9 = findViewById<ImageView>(R.id.imageView9)
        imageView9.setOnClickListener {
            val intent1 = Intent (this, shedules::class.java)
            startActivity(intent1)
        }
    }
}
