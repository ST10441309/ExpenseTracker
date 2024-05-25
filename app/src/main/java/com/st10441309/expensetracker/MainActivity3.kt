package com.st10441309.expensetracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.content.Intent

class MainActivity3 : AppCompatActivity() {
    private var tvExpenseDescription: TextView? = null
    private var tvExpenseTotal: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        tvExpenseDescription = findViewById(R.id.tvExpenseDescription)
        tvExpenseTotal = findViewById(R.id.tvExpenseTotal)

        val btnIncomeSheet = findViewById<Button>(R.id.btnIncome2)
        btnIncomeSheet.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        val btnMainScreen = findViewById<Button>(R.id.btnMain2)
        btnMainScreen.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
