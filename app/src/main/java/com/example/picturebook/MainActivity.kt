package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button1 = findViewById<Button>(R.id.btnnext1)
        button1.setOnClickListener {
            val intent = Intent(baseContext,page2::class.java)
            startActivity(intent)
        }
    }
}