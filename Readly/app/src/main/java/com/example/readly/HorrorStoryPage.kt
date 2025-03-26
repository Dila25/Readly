package com.example.readly

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HorrorStoryPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_horror_story_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Get the extras from the intent
        val imageRes = intent.getIntExtra("IMAGE_RES", 0)
        val title = intent.getStringExtra("TITLE") ?: ""
        val description = intent.getStringExtra("DESCRIPTION") ?: ""

        // Find views
        val storyImage = findViewById<ImageView>(R.id.storyImage)
        val storyTitle = findViewById<TextView>(R.id.storyTitle)
        val storyDescription = findViewById<TextView>(R.id.storyDescription)

        // Set the content
        storyImage.setImageResource(imageRes)
        storyTitle.text = title
        storyDescription.text = description
        // Find the button and set an onClickListener
        val exploreButton: Button = findViewById(R.id.backbtnHor)
        exploreButton.setOnClickListener {
            // Navigate
            val intent = Intent(this, Horror::class.java)
            startActivity(intent)
        }
    }
}