package com.example.sss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun GoNext(view: android.view.View) {
        val nickname = textView.text.toString()
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}