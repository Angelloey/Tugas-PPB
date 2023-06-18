package com.example.minggu5

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

        Log.d(LOG_TAG, "-------")
        Log.d(LOG_TAG, "di create coy")
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

    fun launchSecondActivity(view: View) {
        Log.d(LOG_TAG, "Tombol diklik")

        val message: String = messageEditText?.text.toString()

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }
}