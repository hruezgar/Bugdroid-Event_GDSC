package com.haso.bugdroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val randombut: Button = findViewById(R.id.gen_but)
        val description: TextView = findViewById(R.id.des_id)
        randombut.setOnClickListener{
            var randomNumber = (1..6).random()
            description.text = randomNumber.toString()
        }
    }
}