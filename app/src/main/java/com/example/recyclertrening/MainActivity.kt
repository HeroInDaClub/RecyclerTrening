package com.example.recyclertrening

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mailButton = findViewById<FloatingActionButton>(R.id.mailBut)
        mailButton.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.frame, mail.newInstance()).commit()
        }

    }
}