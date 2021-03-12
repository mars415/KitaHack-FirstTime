package com.example.crops_and_meats

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buyerButton = findViewById<Button>(R.id.buyerButton)
        buyerButton.setOnClickListener {
            val intent =  Intent(this, Products_Vegetables::class.java)
            startActivity(intent)
        }

        var sellerButton = findViewById<Button>(R.id.sellerButton)
        sellerButton.setOnClickListener {
            val intent =  Intent(this, Products_Vegetables::class.java)
            startActivity(intent)
        }
    }
}