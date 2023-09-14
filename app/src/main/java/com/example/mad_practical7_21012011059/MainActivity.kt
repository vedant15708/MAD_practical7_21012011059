package com.example.mad_practical7_21012011059

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mediaController=MediaController(this)
        val uri:Uri=Uri.parse("android.resource://"+packageName+"/"+R.raw.thestoryoflight)
        val Myvdeoview=findViewById<VideoView>(R.id.videoView)
        Myvdeoview.setVideoURI(uri)
        Myvdeoview.requestFocus()
        Myvdeoview.start()
    }
}