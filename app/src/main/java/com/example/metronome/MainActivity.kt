package com.example.metronome

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import com.example.metronome.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        binding.buttonMinus.setOnClickListener {
            var txtSpeed = binding.textSpeed.text.toString()
            var speed = txtSpeed.toInt()
            if (speed > 0)
            {
                binding.textSpeed.setText((speed - 1).toString())
            }
        }

        binding.buttonPlus.setOnClickListener {
            var txtSpeed = binding.textSpeed.text.toString()
            var speed = txtSpeed.toInt()
            if (speed < 250)
            {
                binding.textSpeed.setText((speed + 1).toString())
            }
        }


        var mp = MediaPlayer.create(this, R.raw.tick)

        binding.buttonStart.setOnClickListener {
            mp.start()
        }
    }
}