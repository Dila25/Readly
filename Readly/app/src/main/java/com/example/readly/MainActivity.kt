package com.example.readly

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AlphaAnimation
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private  val FADE_IN_DURATION = 3000L // 1 second
    private  val DISPLAY_DURATION = 3000L // 2 seconds
    private  val FADE_OUT_DURATION = 2000L // 1 second

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Find the ImageView
        val logoImageView: ImageView = findViewById(R.id.logo)

        // Set up fade-in animation
        val fadeIn = AlphaAnimation(0f, 1f).apply {
            duration = FADE_IN_DURATION
            fillAfter = true
        }

        // Set up fade-out animation
        val fadeOut = AlphaAnimation(1f, 0f).apply {
            duration = FADE_OUT_DURATION
            fillAfter = true
        }

        // Start fade-in animation
        logoImageView.startAnimation(fadeIn)

        // After fade-in + display duration, start fade-out and navigate
        Handler(Looper.getMainLooper()).postDelayed({
            logoImageView.startAnimation(fadeOut)

            // After fade-out duration, navigate to ScreenTwo
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this@MainActivity, ScreenOne::class.java)
                startActivity(intent)
                finish() // Close the MainActivity
            }, FADE_OUT_DURATION)
        }, FADE_IN_DURATION + DISPLAY_DURATION)

    }
}