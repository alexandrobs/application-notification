package com.example.applicationnotification

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService

class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        Log.i( TAG,"Refreshed token: $token")
    }

    companion object {
        private const val TAG = "MyFirebaseMessaging"
    }

}