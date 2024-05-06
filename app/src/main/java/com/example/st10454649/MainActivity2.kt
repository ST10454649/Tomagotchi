package com.example.st10454649

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val petImageView = findViewById<ImageView>(R.id.r_png)
        val feedButton = findViewById<Button>(R.id.button2)
        val cleanButton = findViewById<Button>(R.id.button4)
        val playButton = findViewById<Button>(R.id.button3)

        val feedTextView = findViewById<TextView>(R.id.i_am_hungry)
        val cleanTextView = findViewById<TextView>(R.id.i_am_dirty_take_me_for_a_bath)
        val playTextView = findViewById<TextView>(R.id.i_am_bored_lets_go_play)

        val feedMessage = intent.getStringExtra("FEED_MESSAGE")
        feedTextView.text = feedMessage


        feedButton.setOnClickListener {

            petImageView.setImageResource(R.drawable.r_eating)
            feedTextView.text = getString(R.string.thank_you)
            playTextView.text = getString(R.string.play_with_me)

        }


        cleanButton.setOnClickListener {

            petImageView.setImageResource(R.drawable.r_washed)
            cleanTextView.text = getString(R.string.nice_and_clean)

        }


        playButton.setOnClickListener {

            petImageView.setImageResource(R.drawable.r_playin)
            playTextView.text = getString(R.string.play_that_was_fun)
            cleanTextView.text = getString(R.string.clean_after_playing)

        }
    }
}


