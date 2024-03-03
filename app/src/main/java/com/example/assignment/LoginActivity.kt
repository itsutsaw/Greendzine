package com.example.assignment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)


        btnLogin.setOnClickListener {
            // Check credentials (dummy logic for demonstration)
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()
            if (username == "admin" && password == "password") {
                // Start Dashboard activity
                startActivity(Intent(this, DashboardActivity::class.java))
                finish() // Close login activity
            } else {
                // Show error message
                // For simplicity, toast is used, but you should handle errors more gracefully
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
