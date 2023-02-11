package com.example.functionalapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class Web3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web3)

        // Showing a Toast Message upon clicking the header
        val header = findViewById<TextView>(R.id.headerWeb3)
        header.setOnClickListener {
            Toast.makeText(applicationContext, "Click on Programming Language name to Learn More", Toast.LENGTH_SHORT).show()
        }

        // Redirecting to Solidity's official website
        val clickSolidity = findViewById<TextView>(R.id.textSolidity)
        clickSolidity.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://soliditylang.org/")
            startActivity(intent)
        }

        // Redirecting to Rust's official website
        val clickRust = findViewById<TextView>(R.id.textRust)
        clickRust.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.rust-lang.org/")
            startActivity(intent)
        }

        // Redirecting to Go's official website
        val clickGo = findViewById<TextView>(R.id.textGo)
        clickGo.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://go.dev/")
            startActivity(intent)
        }

        // Redirecting to C++ Introduction by GFG
        val clickCpp = findViewById<TextView>(R.id.textCpp)
        clickCpp.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.geeksforgeeks.org/c-plus-plus/?ref=lbp")
            startActivity(intent)
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

    }
}