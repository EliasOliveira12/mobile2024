package com.example.vsconnect_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vsconnect_kotlin.databinding.ActvityLoginBinding


class LoginActivity : AppCompatActivity() {
   private lateinit var binding: ActvityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actvity_login)
    }
}