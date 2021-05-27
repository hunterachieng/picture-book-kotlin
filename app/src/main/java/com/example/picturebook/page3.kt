package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)

        var button1 = findViewById<Button>(R.id.btnNext3)
        button1.setOnClickListener {
            var intent = Intent(baseContext,page4::class.java)
            startActivity(intent)
        }

        var button2 = findViewById<Button>(R.id.btnPrevious3)
        button2.setOnClickListener {
            var intent = Intent(baseContext,page2::class.java)
            startActivity(intent)
        }
    }
}