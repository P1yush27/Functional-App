package com.example.functionalapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class CloudActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cloud)

        // Showing a Toast Message upon clicking the header
        val header = findViewById<TextView>(R.id.headerCloud)
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

        // Redirecting to ASP.NET's official website
        val clickNet = findViewById<TextView>(R.id.textNet)
        clickNet.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://dotnet.microsoft.com/en-us/apps/aspnet")
            startActivity(intent)
        }

        // Redirecting to Ruby's official website
        val clickRuby = findViewById<TextView>(R.id.textRuby)
        clickRuby.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.ruby-lang.org/en/")
            startActivity(intent)
        }

        // Redirecting to PHP Introduction by W3Schools
        val clickPHP = findViewById<TextView>(R.id.textPHP)
        clickPHP.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/php/php_intro.asp")
            startActivity(intent)
        }
    }
}