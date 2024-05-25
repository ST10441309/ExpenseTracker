package com.st10441309.expensetracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    private var tvIncomeDescription: TextView? = null
    private var tvIncomeTotal: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tvIncomeDescription = findViewById(R.id.tvIncomeDescription)
        tvIncomeTotal = findViewById(R.id.tvIncomeTotal)

        val btnExpenseSheet = findViewById<Button>(R.id.btnExpense2)
        btnExpenseSheet.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        val btnMainScreen = findViewById<Button>(R.id.btnMain)
        btnMainScreen.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
