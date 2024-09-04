package com.example.quiz_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.quiz_app.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizBinding

    private var index = 0

    private val quizList = listOf(
        Quiz(
            "What is a correct syntax to output \"Hello World\" in Kotlin?",
            "Console.WriteLine(\"Hello World\");",
            "count << \"Hello World\"",
            "System.out.printline(\"Hello World\")",
            "println(\"Hello World\")",
            "println(\"Hello World\")"
        ),
        Quiz(
            "You can create an emulator to simulate the configuration of a particular type of Android device using a tool like ___.",
            "Theme Editor",
            "AVD Manager",
            "Android SDK Manager",
            "Virtual Editor",
            "AVD Manager"
        ),
        Quiz(
            "What parameter specifies the Android API level that Gradle should use to compile your app?",
            "minSdkVersion",
            "check_circle_outline",
            "compileSdkVersion",
            "targetSdkVersion",
            "compileSdkVersion"

        ),
        Quiz(
            "You can show or hide a view in your app by setting its visibility. Which of the following are valid visibility values?",
            "GONE",
            "VISIBLE",
            "CLEAR",
            "INVISIBLE",
            "VISIBLE"
        ),
        Quiz(
            "What phrase means that the compiler validates types while compiling?",
            "Type safety",
            "Data binding",
            "Type validation",
            "Wrong text",
            "Type safety"
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityQuizBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        getQuiz()

    }

    private fun getQuiz() {

        val quiz = quizList[index]

        binding.apply {

            quizQuestion.text = quiz.question
            option1.text = quiz.option1
            option2.text = quiz.option2
            option3.text = quiz.option3
            option4.text = quiz.option4

        }

    }

}