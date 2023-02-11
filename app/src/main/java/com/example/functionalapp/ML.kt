package com.example.functionalapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class ML : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ml)

        // Showing a Toast Message upon clicking the header
        val header = findViewById<TextView>(R.id.headerML)
        header.setOnClickListener {
            Toast.makeText(applicationContext, "Click on Programming Language name to Learn More", Toast.LENGTH_SHORT).show()
        }

        // Redirecting to Python's official website
        val clickPython = findViewById<TextView>(R.id.textPython)
        clickPython.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.python.org/")
            startActivity(intent)
        }

        // Redirecting to R's official website
        val clickR = findViewById<TextView>(R.id.textR)
        clickR.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.r-project.org/about.html")
            startActivity(intent)
        }

        // Redirecting to JavaScript Introduction by W3Schools
        val clickJS = findViewById<TextView>(R.id.textJS)
        clickJS.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/js/js_intro.asp")
            startActivity(intent)
        }

        // Redirecting to C++ Introduction by GFG
        val clickCpp = findViewById<TextView>(R.id.textCpp)
        clickCpp.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.geeksforgeeks.org/c-plus-plus/?ref=lbp")
            startActivity(intent)
        }
    }
}