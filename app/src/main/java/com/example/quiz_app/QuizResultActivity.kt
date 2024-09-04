package com.example.quiz_app

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.quiz_app.databinding.ActivityQuizResultBinding

class QuizResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizResultBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityQuizResultBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {

            totalSkip.text = "Total Skip Answer: ${intent.getIntExtra("Total Skip Answer:", 0)}"
            totalCorrect.text = "Total Correct Answer: ${intent.getIntExtra("Total Correct Answer:", 0)}"
            totalWrong.text = "Total Wrong Answer: ${intent.getIntExtra("Total Wrong Answer:", 0)}"

            tryAgainBtn.setOnClickListener {

                intent = Intent(this@QuizResultActivity, QuizActivity::class.java)
                startActivity(intent)

            }

        }

    }
}