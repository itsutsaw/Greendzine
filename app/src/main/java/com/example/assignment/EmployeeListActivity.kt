package com.example.assignment

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener

class EmployeeListActivity : AppCompatActivity() {
    private val employees = arrayOf("John Doe", "Jane Smith", "Robert Johnson", "Emily Brown")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_list)
        val listView = findViewById<ListView>(R.id.listView)
        val etSearch = findViewById<EditText>(R.id.etSearch)



        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, employees)
        listView.adapter = adapter

        // Filter employees based on search query
        etSearch.addTextChangedListener {
            adapter.filter.filter(it.toString())
        }
    }
}
