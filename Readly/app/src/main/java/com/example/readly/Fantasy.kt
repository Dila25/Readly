package com.example.readly

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageView

class Fantasy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fantasy)

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
        findViewById<ImageView>(R.id.bkone).setOnClickListener {
            navigateToStoryPage(
                R.drawable.bk1,
                "Fourth Wing",
                "Twenty-year-old Violet Sorrengail was supposed to enter the Scribe Quadrant, living a quiet life among books and history. Now, the commanding general—also known as her tough-as-talons mother—has ordered Violet to join the hundreds of candidates striving to become the elite of Navarre: dragon riders.\n" +
                        "\n" +
                        "But when you’re smaller than everyone else and your body is brittle, death is only a heartbeat away...because dragons don’t bond to “fragile” humans. They incinerate them.\n" +
                        "\n" +
                        "With fewer dragons willing to bond than cadets, most would kill Violet to better their own chances of success. The rest would kill her just for being her mother’s daughter—like Xaden Riorson, the most powerful and ruthless wingleader in the Riders Quadrant.\n" +
                        "\n" +
                        "She’ll need every edge her wits can give her just to see the next sunrise.\n" +
                        "\n" +
                        "Yet, with every day that passes, the war outside grows more deadly, the kingdom's protective wards are failing, and the death toll continues to rise. Even worse, Violet begins to suspect leadership is hiding a terr"
            )
        }

        findViewById<ImageView>(R.id.bktwo).setOnClickListener {
            navigateToStoryPage(
                R.drawable.bk2,
                "A Court of Thorns and Roses",
                "When nineteen-year-old huntress Feyre kills a wolf in the woods, a terrifying creature arrives to demand retribution. Dragged to a treacherous magical land she knows about only from legends, Feyre discovers that her captor is not truly a beast, but one of the lethal, immortal faeries who once ruled her world.\n" +
                        "\n" +
                        "At least, he’s not a beast all the time.\n" +
                        "\n" +
                        "As she adapts to her new home, her feelings for the faerie, Tamlin, transform from icy hostility into a fiery passion that burns through every lie she’s been told about the beautiful, dangerous world of the Fae. But something is not right in the faerie lands. An ancient, wicked shadow is growing, and Feyre must find a way to stop it, or doom Tamlin—and his world—forever.\n" +
                        "\n" +
                        "From bestselling author Sarah J. Maas comes a seductive, breathtaking book that blends romance, adventure, and faerie lore into an unforgettable read."
            )
        }

        findViewById<ImageView>(R.id.bkthree).setOnClickListener {
            navigateToStoryPage(
                R.drawable.bk3,
                "One Dark Window",
                "Elspeth needs a monster. The monster might be her.\n" +
                        "\n" +
                        "Elspeth Spindle needs more than luck to stay safe in the eerie, mist-locked kingdom of Blunder—she needs a monster. She calls him the Nightmare, an ancient, mercurial spirit trapped in her head. He protects her. He keeps her secrets.\n" +
                        "\n" +
                        "But nothing comes for free, especially magic.\n" +
                        "\n" +
                        "When Elspeth meets a mysterious highwayman on the forest road, her life takes a drastic turn. Thrust into a world of shadow and deception, she joins a dangerous quest to cure Blunder from the dark magic infecting it. And the highwayman? He just so happens to be the King’s nephew, Captain of the most dangerous men in Blunder…and guilty of high treason.\n" +
                        "\n" +
                        "Together they must gather twelve Providence Cards—the keys to the cure. But as the stakes heighten and their undeniable attraction intensifies, Elspeth is forced to face her darkest secret yet: the Nightmare is slowly taking over her mind. And she might not be able to stop him."
            )
        }
    }

    private fun navigateToStoryPage(imageRes: Int, title: String, description: String) {
        val intent = Intent(this, StoryPage::class.java).apply {
            putExtra("IMAGE_RES", imageRes)
            putExtra("TITLE", title)
            putExtra("DESCRIPTION", description)
        }
        startActivity(intent)
    }
}