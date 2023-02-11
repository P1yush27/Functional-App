package com.example.functionalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val goButton = findViewById<Button>(R.id.goBtn)

        goButton.setOnClickListener{
            val goIntent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(goIntent)
        }
    }
}