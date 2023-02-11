package com.example.functionalapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class AppDevActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_dev)

        // Showing a Toast Message upon clicking the header
        val clickHeader = findViewById<TextView>(R.id.headerAppDev)
        clickHeader.setOnClickListener {
            Toast.makeText(applicationContext,"Click on Programming Language name to Learn More",Toast.LENGTH_SHORT).show()
        }

        // Redirecting to Kotlin's official website
        val clickKotlin = findViewById<TextView>(R.id.textKotlin)
        clickKotlin.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://kotlinlang.org/")
            startActivity(intent)
        }

        // Redirecting to Java's official website
        val clickJava = findViewById<TextView>(R.id.textJava)
        clickJava.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.oracle.com/in/java/")
            startActivity(intent)
        }

        // Redirecting to XML Introduction by W3Schools
        val clickXML = findViewById<TextView>(R.id.textXML)
        clickXML.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/xml/xml_whatis.asp")
            startActivity(intent)
        }

        // Redirecting to Firebase's official website
        val clickFirebase = findViewById<TextView>(R.id.textFirebase)
        clickFirebase.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://firebase.google.com/")
            startActivity(intent)
        }
    }

}