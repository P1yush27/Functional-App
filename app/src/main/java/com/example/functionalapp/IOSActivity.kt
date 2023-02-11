package com.example.functionalapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class IOSActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iosactivity)

        // Showing a Toast Message upon clicking the header
        val header = findViewById<TextView>(R.id.headerIOS)
        header.setOnClickListener {
            Toast.makeText(applicationContext,"Click on Programming Language name to Learn More",Toast.LENGTH_SHORT).show()
        }

        // Redirecting to Swift's Introduction by Apple
        val clickSwift = findViewById<TextView>(R.id.textSwift)
        clickSwift.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://developer.apple.com/swift/")
            startActivity(intent)
        }

        // Redirecting to Flutter's official website
        val clickFlutter = findViewById<TextView>(R.id.textFlutter)
        clickFlutter.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://flutter.dev/")
            startActivity(intent)
        }

        // Redirecting to ReactNative's official website
        val clickReactNative = findViewById<TextView>(R.id.textReactNative)
        clickReactNative.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://reactnative.dev/")
            startActivity(intent)
        }

        // Redirecting to Objective-C documentation by Apple
        val clickObjC = findViewById<TextView>(R.id.textObjC)
        clickObjC.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://developer.apple.com/library/archive/documentation/Cocoa/Conceptual/ProgrammingWithObjectiveC/Introduction/Introduction.html")
            startActivity(intent)
        }
    }
}