package com.example.applicationnotification

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceIdService
import com.google.firebase.iid.FirebaseInstanceId

class MyFirebaseInstanceIdService : FirebaseInstanceIdService() {

    override fun onTokenRefresh(){
        Log.i("**newTokenService", MyFirebaseInstanceId.getInstance().toString())
    }
}