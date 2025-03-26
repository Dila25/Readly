package com.example.readly

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Horror : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_horror)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val fanButton: Button = findViewById(R.id.button)
        fanButton.setOnClickListener {
            // Navigate
            val intent = Intent(this, Fantasy::class.java)
            startActivity(intent)
        }
        val romButton: Button = findViewById(R.id.button2)
        romButton.setOnClickListener {
            // Navigate
            val intent = Intent(this, Romance::class.java)
            startActivity(intent)
        }
        val horButton: Button = findViewById(R.id.button3)
        horButton.setOnClickListener {
            // Navigate
            val intent = Intent(this, Horror::class.java)
            startActivity(intent)
        }
        // Set click listeners for each image
        findViewById<ImageView>(R.id.hbkone).setOnClickListener {
            navigateToStoryPage(
                R.drawable.bkh1,
                "Stephen King",
                "Jack Torrance's new job at the Overlook Hotel is the perfect chance for a fresh start. As the off-season caretaker at the atmospheric old hotel, he'll have plenty of time to spend reconnecting with his family and working on his writing. But as the harsh winter weather sets in, the idyllic location feels ever more remote...and more sinister. And the only one to notice the strange and terrible forces gathering around the Overlook is Danny Torrance, a uniquely gifted five-year-old."
            )
        }

        findViewById<ImageView>(R.id.hbktwo).setOnClickListener {
            navigateToStoryPage(
                R.drawable.bkh2,
                "We Used To Live Here",
                "From an author “destined to become a titan of the macabre and unsettling” (Erin A. Craig, #1 New York Times bestselling author), a haunting debut—soon to be a Netflix original movie—about two homeowners whose lives are turned upside down when the house’s previous residents unexpectedly visit.\n" +
                        "\n" +
                        "As a young, queer couple who flip houses, Charlie and Eve can’t believe the killer deal they’ve just gotten on an old house in a picturesque neighborhood. As they’re working in the house one day, there’s a knock on the door. A man stands there with his family, claiming to have lived there years before and asking if it would be alright if he showed his kids around. People pleaser to a fault, Eve lets them in.\n" +
                        "\n" +
                        "As soon as the strangers enter their home, inexplicable things start happening, including the family’s youngest child going missing and a ghostly presence materializing in the basement. Even more weird, the family can’t seem to take the hint that their visit should be over. And when Charlie suddenly vanishes, Eve s"
            )
        }

        findViewById<ImageView>(R.id.hbkthree).setOnClickListener {
            navigateToStoryPage(
                R.drawable.bkh3,
                "Mexican Gothic",
                "After receiving a frantic letter from her newly-wed cousin begging for someone to save her from a mysterious doom, Noemí Taboada heads to High Place, a distant house in the Mexican countryside. She’s not sure what she will find—her cousin’s husband, a handsome Englishman, is a stranger, and Noemí knows little about the region.\n" +
                        "\n" +
                        "Noemí is also an unlikely rescuer: She’s a glamorous debutante, and her chic gowns and perfect red lipstick are more suited for cocktail parties than amateur sleuthing. But she’s also tough and smart, with an indomitable will, and she is not afraid: Not of her cousin’s new husband, who is both menacing and alluring; not of his father, the ancient patriarch who seems to be fascinated by Noemí; and not even of the house itself, which begins to invade Noemi’s dreams with visions of blood and doom.\n" +
                        "\n" +
                        "Her only ally in this inhospitable abode is the family’s youngest son. Shy and gentle, he seems to want to help Noemí, but might also be hiding dark knowledge of his family’s past. For there ar"
            )
        }
    }
    private fun navigateToStoryPage(imageRes: Int, title: String, description: String) {
        val intent = Intent(this, HorrorStoryPage::class.java).apply {
            putExtra("IMAGE_RES", imageRes)
            putExtra("TITLE", title)
            putExtra("DESCRIPTION", description)
        }
        startActivity(intent)
    }
}