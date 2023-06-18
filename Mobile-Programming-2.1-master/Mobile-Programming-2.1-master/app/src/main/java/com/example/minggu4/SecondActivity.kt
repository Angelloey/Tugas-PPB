package com.example.minggu4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val messageTextView = findViewById<TextView>(R.id.textView)
        val quantityTextView = findViewById<TextView>(R.id.numberView)

        val bundle = intent.getBundleExtra("bundle")
        val message = bundle?.getString("EXTRA_MESSAGE")
        val quantity = bundle?.getInt("EXTRA_QUANTITY")
        messageTextView.text = message
        quantityTextView.text = quantity?.toString() ?: ""
    }
}