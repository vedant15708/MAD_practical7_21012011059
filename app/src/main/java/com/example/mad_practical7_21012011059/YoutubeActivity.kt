package com.example.mad_practical7_21012011059

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.widget.VideoView

class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val youtubewebview=findViewById<WebView>(R.id.webview)
        val youtubeId = "fJn9B64Znrk"
        val webSettings:WebSettings=youtubewebview.settings
        webSettings.javaScriptEnabled=true
        webSettings.loadWithOverviewMode=true
        webSettings.useWideViewPort=true
        youtubewebview.loadUrl("https://www.youtube.com/embed/$youtubeId")
    }
}