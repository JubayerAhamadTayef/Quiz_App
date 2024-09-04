package com.example.quiz_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.quiz_app.databinding.ActivityQuizResultBinding

class QuizResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityQuizResultBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}