package com.example.functionalapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val androidDevBtn = findViewById<CardView>(R.id.cardAndroid)
        androidDevBtn.setOnClickListener{
            val intent = Intent(applicationContext, AppDevActivity::class.java)
            startActivity(intent)
        }

        val webDevBtn = findViewById<CardView>(R.id.cardWebDev)
        webDevBtn.setOnClickListener{
            val intent = Intent(applicationContext, WebDevActivity::class.java)
            startActivity(intent)
        }

        val iosDevBtn = findViewById<CardView>(R.id.cardIOSAppDev)
        iosDevBtn.setOnClickListener{
            val intent = Intent(applicationContext, IOSActivity::class.java)
            startActivity(intent)
        }

        val mlBtn = findViewById<CardView>(R.id.cardML)
        mlBtn.setOnClickListener {
            val intent = Intent(applicationContext, ML::class.java)
            startActivity(intent)
        }

        val web3Btn = findViewById<CardView>(R.id.cardWeb3)
        web3Btn.setOnClickListener {
            val intent = Intent(applicationContext, Web3::class.java)
            startActivity(intent)
        }

        val cloudBtn = findViewById<CardView>(R.id.cardCloud)
        cloudBtn.setOnClickListener {
            val intent = Intent(applicationContext, CloudActivity::class.java)
            startActivity(intent)
        }

        val contactButton = findViewById<Button>(R.id.contactBtn)
        contactButton.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "+919876543210")
            startActivity(intent)
        }
    }
}