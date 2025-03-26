package com.example.readly

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Romance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_romance)
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
        findViewById<ImageView>(R.id.rbkone).setOnClickListener {
            navigateToStoryPage(
                R.drawable.bkr1,
                "Reminders Of Him",
                "A troubled young mother yearns for a shot at redemption in this heartbreaking yet hopeful story from #1 New York Times bestselling author Colleen Hoover. After serving five years in prison for a tragic mistake, Kenna Rowan returns to the town where it all went wrong, hoping to reunite with her four-year-old daughter. But the bridges Kenna burned are proving impossible to rebuild. Everyone in her daughter’s life is determined to shut Kenna out, no matter how hard she works to prove herself. The only person who hasn’t closed the door on her completely is Ledger Ward, a local bar owner and one of the few remaining links to Kenna’s daughter. But if anyone were to discover how Ledger is slowly becoming an important part of Kenna’s life, both would risk losing the trust of everyone important to them. The two form a connection despite the pressure surrounding them, but as their romance grows, so does the risk. Kenna must find a way to absolve the mistakes of her past in order to build a future out of hope and healin"
            )
        }

        findViewById<ImageView>(R.id.rbktwo).setOnClickListener {
            navigateToStoryPage(
                R.drawable.bkr2,
                "The Seven Husbands Of Evelyn Hugo",
                "Aging and reclusive Hollywood movie icon Evelyn Hugo is finally ready to tell the truth about her glamorous and scandalous life. But when she chooses unknown magazine reporter Monique Grant for the job, no one is more astounded than Monique herself. Why her? Why now?\n" +
                        "\n" +
                        "Monique is not exactly on top of the world. Her husband has left her, and her professional life is going nowhere. Regardless of why Evelyn has selected her to write her biography, Monique is determined to use this opportunity to jumpstart her career.\n" +
                        "\n" +
                        "Summoned to Evelyn’s luxurious apartment, Monique listens in fascination as the actress tells her story. From making her way to Los Angeles in the 1950s to her decision to leave show business in the ‘80s, and, of course, the seven husbands along the way, Evelyn unspools a tale of ruthless ambition, unexpected friendship, and a great forbidden love. Monique begins to feel a very real connection to the legendary star, but as Evelyn’s story nears its conclusion, it becomes clear that her life intersec"
            )
        }

        findViewById<ImageView>(R.id.rbkthree).setOnClickListener {
            navigateToStoryPage(
                R.drawable.bkr3,
                "Freida Mcfadden",
                "Sydney Shaw, like every single woman in New York, has terrible luck with dating. She’s seen it men who lie in their dating profile, men who stick her with the dinner bill, and worst of all, men who can't shut up about their mothers. But finally, she hits the jackpot.\n" +
                        "\n" +
                        "Her new boyfriend is utterly perfect. He's charming, handsome, and works as a doctor at a local hospital. Sydney is swept off her feet.\n" +
                        "\n" +
                        "Then the brutal murder of a young woman―the latest in a string of deaths across the coast―confounds police. The primary suspect? A mystery man who dates his victims before he kills them.\n" +
                        "\n" +
                        "Sydney should feel safe. After all, she is dating the guy of her dreams. But she can’t shake her own suspicions that the perfect man may not be as perfect as he seems. Because someone is watching her every move, and if she doesn’t get to the truth, she’ll be the killer’s next victim...\n" +
                        "\n" +
                        "A dark story about obsession and the things we’ll do for love, #1 New York Times bestselling author Freida McFadden proves that crimes of pass"
            )
        }
    }
    private fun navigateToStoryPage(imageRes: Int, title: String, description: String) {
        val intent = Intent(this, RomanceStroyPage::class.java).apply {
            putExtra("IMAGE_RES", imageRes)
            putExtra("TITLE", title)
            putExtra("DESCRIPTION", description)
        }
        startActivity(intent)
    }
}