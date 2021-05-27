package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        var button1 = findViewById<Button>(R.id.btnnext2)
        button1.setOnClickListener {
            var intent = Intent(baseContext,page3::class.java)
            startActivity(intent)
        }

        var button2 = findViewById<Button>(R.id.btnPrevious1)
        button2.setOnClickListener {
            var intent = Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
    }
}