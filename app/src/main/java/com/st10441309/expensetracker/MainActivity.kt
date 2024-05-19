package com.st10441309.expensetracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.content.Intent

class MainActivity : AppCompatActivity() {
    private var tvDisplayAmount: TextView? = null
    private var tvDisplayIncome: TextView? = null
    private var tvDisplayExpense: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvDisplayAmount = findViewById(R.id.tvDisplayAmount)
        tvDisplayIncome = findViewById(R.id.tvDisplayIncome)
        tvDisplayExpense = findViewById(R.id.tvDisplayExpense)

        val btnIncomeSheet = findViewById<Button>(R.id.btnIncome)
        btnIncomeSheet.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        val btnExpenseSheet = findViewById<Button>(R.id.btnExpense)
        btnExpenseSheet.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}