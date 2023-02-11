package com.example.functionalapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class WebDevActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_dev)

        // Showing a Toast Message upon clicking the header
        val clickHeader = findViewById<TextView>(R.id.headerWebDev)
        clickHeader.setOnClickListener {
            Toast.makeText(applicationContext,"Click on Programming Language name to Learn More", Toast.LENGTH_SHORT).show()
        }

        // Redirecting to HTML Introduction by W3Schools
        val clickHTML = findViewById<TextView>(R.id.textHTML)
        clickHTML.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/html/html_intro.asp")
            startActivity(intent)
        }

        // Redirecting to CSS Introduction by W3Schools
        val clickCSS = findViewById<TextView>(R.id.textCSS)
        clickCSS.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/css/css_intro.asp")
            startActivity(intent)
        }

        // Redirecting to JavaScript Introduction by W3Schools
        val clickJS = findViewById<TextView>(R.id.textJS)
        clickJS.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/js/js_intro.asp")
            startActivity(intent)
        }

        // Redirecting to ReactJS official website
        val clickReactJS = findViewById<TextView>(R.id.textReactJS)
        clickReactJS.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://reactjs.org/")
            startActivity(intent)
        }

        // Redirecting to NodeJS official website
        val clickNodeJS = findViewById<TextView>(R.id.textNodeJS)
        clickNodeJS.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://nodejs.dev/en/learn/")
            startActivity(intent)
        }

    }
}