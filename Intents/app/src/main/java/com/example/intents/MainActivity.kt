package com.example.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var dialphone : Button = findViewById(R.id.dial_phone)
        var edtph:EditText=findViewById<EditText>(R.id.phone)

        dialphone.setOnClickListener{
            var uri= Uri.parse("tel:"+edtph.text.toString())
            startActivity(Intent(Intent.ACTION_DIAL,uri))
        }
    }
}