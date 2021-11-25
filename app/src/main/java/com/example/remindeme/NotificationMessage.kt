package com.example.remindeme

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


//this class creates the Reminder Notification Message

//this class creates the Reminder Notification Message
class NotificationMessage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_message)
        var textView = findViewById<TextView>(R.id.tv_message)
        var bundle = intent.extras //call the data which is passed by another intent
        textView.setText(bundle!!.getString("message"))
    }
}
