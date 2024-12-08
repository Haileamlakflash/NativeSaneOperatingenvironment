package com.example.myandroidapp

import android.os.Bundle
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OverlayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.overlay_layout)

        val inputText = intent.getStringExtra("inputText")
        val textView = findViewById<TextView>(R.id.displayText)
        val cancelButton = findViewById<Button>(R.id.cancelButton)
        val sendButton = findViewById<Button>(R.id.sendButton)

        textView.text = inputText

        // Dim the background
        val layoutParams = window.attributes
        layoutParams.dimAmount = 0.6f
        window.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)

        cancelButton.setOnClickListener { finish() }
        sendButton.setOnClickListener { finish() }
    }
}
