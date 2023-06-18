package com.example.minggu4

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_MESSAGE = "com.example.minggu4.extra.MESSAGE"
        const val EXTRA_QUANTITY = "com.example.minggu4.extra.QUANTITY"
    }

    private val LOG_TAG = MainActivity::class.simpleName

    private var messageEditText: EditText? = null
    private var quantityEditText: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        messageEditText = findViewById(R.id.editText_main)
        quantityEditText = findViewById(R.id.editQuantity_main)

        Log.d(LOG_TAG, "-------")
        Log.d(LOG_TAG, "onCreate")
    }

    fun launchSecondActivity(view: View) {
        Log.d(LOG_TAG, "Tombol diklik")

        val message: String = messageEditText?.text.toString()
        val quantity: Int = quantityEditText?.text.toString().toInt()

        val intentMsg = Intent(this, SecondActivity::class.java)
        val intentQty = Intent(this, SecondActivity::class.java)

        val bundle = Bundle().apply {
            putString("EXTRA_MESSAGE", message)
            putInt("EXTRA_QUANTITY", quantity)
        }

        val mainIntent = Intent(this, SecondActivity::class.java)
        mainIntent.putExtra("bundle", bundle)

        startActivity(mainIntent)
    }
}