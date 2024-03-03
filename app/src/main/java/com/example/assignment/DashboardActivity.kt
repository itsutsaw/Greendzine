package com.example.assignment

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val ivHome = findViewById<ImageView>(R.id.ivHome)
        val ivUser = findViewById<ImageView>(R.id.ivUser)

        // Home icon click listener
        ivHome.setOnClickListener {
            // Do nothing as it's already in the Dashboard activity
        }

        // User icon click listener
        ivUser.setOnClickListener {
            startActivity(Intent(this, EmployeeListActivity::class.java))
        }
    }
}
