package com.example.acidpeirplintop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class pelajar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pelajar)

        val web1: WebView = findViewById(R.id.web1)
        web1.settings.javaScriptEnabled = true
        web1.loadUrl("https://id.priceprice.com/harga-laptop/news/Laptop-Murah-Terbaik-Bagus-Untuk-Mahasiswa-9986/")
    }
}