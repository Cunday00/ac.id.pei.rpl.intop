package com.example.acidpeirplintop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnlaming: Button = findViewById(R.id.laming)
        btnlaming.setOnClickListener {
            startActivity(Intent(this, gaming::class.java))
        }

        val btnlator: Button = findViewById(R.id.lator)
        btnlator.setOnClickListener {
            startActivity(Intent(this, editor::class.java))
        }

        val btnlajar: Button = findViewById(R.id.lajar)
        btnlajar.setOnClickListener {
            startActivity(Intent(this, pelajar::class.java))
        }

    }
}