package com.example.acidpeirplintop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class editor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editor)

        val web: WebView = findViewById(R.id.web)
        web.settings.javaScriptEnabled = true
        web.loadUrl("https://www.pricebook.co.id/article/market_issue/2015/07/13/1563/daftar-laptop-yang-pas-untuk-editing-video")
    }
}