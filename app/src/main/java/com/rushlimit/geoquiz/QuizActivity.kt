package com.rushlimit.geoquiz

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity

import android.widget.Button
import android.widget.Toast

class QuizActivity : AppCompatActivity() {

    lateinit var trueButton: Button
    lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        trueButton.setOnClickListener({
            makeText(R.string.correct_toast)
        })

        falseButton.setOnClickListener({
            makeText(R.string.incorrect_toast)
        })
    }

    private fun Context.makeText(resId: Int, duration: Int = Toast.LENGTH_SHORT) {
        val toast = Toast.makeText(this, resId, duration)
        toast.setGravity(Gravity.TOP, 0, 0)
        toast.show()
    }
}
