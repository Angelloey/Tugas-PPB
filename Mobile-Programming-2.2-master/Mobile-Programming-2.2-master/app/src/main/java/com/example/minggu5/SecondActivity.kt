package com.example.minggu5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private val LOG_TAG = SecondActivity::class.simpleName
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

//        if (isVisible) {
//            messageTextView.setVisibility(view.VISIBLE)
//            messageTextView.text = it.getString("view_text")
//        }

    }

    override fun onStart(){
        super.onStart()
        Log.d(LOG_TAG, "di start coy")
    }

    override fun onPause(){
        super.onPause()
        Log.d(LOG_TAG, "di pause coy")
    }

    override fun onRestart(){
        super.onRestart()
        Log.d(LOG_TAG, "di restart coy")
    }

    override fun onResume(){
        super.onResume()
        Log.d(LOG_TAG, "di resume coy")
    }

    override fun onStop(){
        super.onStop()
        Log.d(LOG_TAG, "di stop coy")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.d(LOG_TAG, "di ancurin coy")
        Log.d(LOG_TAG, "selesai coy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        val messageTextView = findViewById<TextView>(R.id.textView)
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        messageTextView.text = message
    }
}