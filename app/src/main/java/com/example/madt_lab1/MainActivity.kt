package com.example.helloworld   // package

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    private var ClickCount = 0
    private var IsRed = false
    private var IsDark = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TextViewMessage = findViewById<TextView>(R.id.TextViewMessage)
        val ButtonChangeText = findViewById<Button>(R.id.ButtonChangeText)
        val ButtonChangeTextColor = findViewById<Button>(R.id.ButtonChangeTextColor)
        val ButtonChangeBackground = findViewById<Button>(R.id.ButtonChangeBackground)
        val MainLayout = findViewById<ConstraintLayout>(R.id.MainLayout)


        ButtonChangeText.setOnClickListener {
            ClickCount++
            TextViewMessage.text = "Button clicked $ClickCount times!"
        }


        ButtonChangeTextColor.setOnClickListener {
            IsRed = !IsRed
            TextViewMessage.setTextColor(if (IsRed) Color.RED else Color.BLACK)
        }


        ButtonChangeBackground.setOnClickListener {
            IsDark = !IsDark
            MainLayout.setBackgroundColor(if (IsDark) Color.LTGRAY else Color.WHITE)
        }

        // Code for revert
    }
}