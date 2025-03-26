package com.example.readly

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Find the button and set an onClickListener
        val exploreButton: Button = findViewById(R.id.buttonlog)
        exploreButton.setOnClickListener {
            // Display the "loginSuccess" message
            Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show()

            // Navigate to Home
            val intent = Intent(this, Fantasy::class.java)
            startActivity(intent)
        }

        // Find the button and set an onClickListener
        val exploreTextView: TextView = findViewById(R.id.regword)
        exploreTextView.setOnClickListener {
            // Navigate to Register
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }
    }
}