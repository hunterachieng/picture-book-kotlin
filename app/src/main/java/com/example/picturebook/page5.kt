package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)

        var button = findViewById<Button>(R.id.btnPrevious5)
        button.setOnClickListener {
            var intent = Intent(baseContext,page4::class.java)
            startActivity(intent)
        }
    }
}