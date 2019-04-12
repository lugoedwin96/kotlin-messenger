package com.example.kotlinmessenger

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = email_registeration.text.toString()
        val password = password_registeration.text.toString()

        Log.d("MainActivity", "My email is: $email")
        Log.d("MainActivity", "My password is: $password")
    }
}
