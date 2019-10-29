package com.example.responsi_026

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*
import android.widget.TextView


class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val intent = intent
        val email = intent.getStringExtra("email")
        val password = intent.getStringExtra("password")

        val textView = findViewById<TextView>(R.id.textView)
        textView.text= "jmu"+email
        textView.text="psd"+password


    }
}
