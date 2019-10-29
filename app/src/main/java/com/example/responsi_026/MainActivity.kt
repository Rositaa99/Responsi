package com.example.responsi_026


import android.os.Bundle
import android.content.Intent
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        val editText = findViewById<EditText>(R.id.email)
        val editText2 = findViewById<EditText>(R.id.password)

        btnLogin.setOnClickListener() {
            val email = email.text.toString()
            val password = password.text.toString()

           intent = Intent(this@MainActivity, Register::class.java)
           intent.putExtra("id_value", email)
           intent.putExtra("language_value", password)

           startActivity(intent)

        }
    }
}

