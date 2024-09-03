package com.example.quiz_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.example.quiz_app.databinding.ActivityMainBinding

class StartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {

            lightTheme.setOnClickListener {

                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

            }

            darkTheme.setOnClickListener {

                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

            }

            startBtn.setOnClickListener {

                intent = Intent(this@StartActivity, QuizActivity::class.java)
                startActivity(intent)

            }

        }

    }
}