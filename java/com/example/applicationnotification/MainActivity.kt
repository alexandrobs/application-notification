package com.example.applicationnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var buttonSendNotification: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSendNotification = findViewById(R.id.button_send_notification)

        buttonSendNotification.setOnClickListener {
            this.showNotification("1234", "bootcamp Android", "kotlin Android notification curso")
        }
    }
}