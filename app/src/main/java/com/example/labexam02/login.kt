package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent1 = Intent (this, home::class.java)
            startActivity(intent1)
        }

        val textView4 = findViewById<TextView>(R.id.textView4)
        textView4.setOnClickListener {
            val intent = Intent(this, reset_pw::class.java)
            startActivity(intent)
        }

        val textView5 = findViewById<TextView>(R.id.textView5)
        textView5.setOnClickListener {
            val intent = Intent(this, sign_up::class.java)
            startActivity(intent)
        }
    }
}