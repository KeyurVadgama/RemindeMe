package com.example.remindeme

import android.app.ProgressDialog
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.provider.MediaStore
import android.widget.MediaController
import android.widget.ProgressBar
import android.widget.VideoView
import java.net.URI

class Splash_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        var vv = findViewById<VideoView>(R.id.videoView)
        val MediaController = MediaController(this)
        MediaController.setAnchorView(vv)
        vv?.setVideoURI(Uri.parse("android.resource://"+packageName+"/"+R.raw.spleshvideo))
        vv?.requestFocus()
        vv.start()
        Handler().postDelayed({

            var  i = Intent(applicationContext,MainActivity::class.java)
            startActivity(i)
            finish()
        },3000)

    }
}