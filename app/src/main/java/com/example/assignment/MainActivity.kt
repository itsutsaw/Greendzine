package com.example.assignment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Check if the user is authenticated
        val isAuthenticated = checkAuthentication()

        // Decide which activity to navigate to based on authentication status
        val destinationActivity = if (isAuthenticated) {
            DashboardActivity::class.java
        } else {
            LoginActivity::class.java
        }

        // Start the appropriate activity
        startActivity(Intent(this, destinationActivity))

        // Finish the com.example.assignment.MainActivity to prevent the user from returning to it using the back button
        finish()
    }

    private fun checkAuthentication(): Boolean {
        // Implement your authentication logic here
        // For example, check if the user has a saved authentication token
        // Return true if authenticated, false otherwise
        return true // Placeholder, replace with actual logic
    }
}
