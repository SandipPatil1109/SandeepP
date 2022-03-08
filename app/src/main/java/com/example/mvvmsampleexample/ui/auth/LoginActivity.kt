package com.example.mvvmsampleexample.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvmsampleexample.R
import com.example.mvvmsampleexample.util.toast

class LoginActivity : AppCompatActivity(), AuthListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun onStarted() {
        toast("Login Started")
    }

    override fun onSuccess() {
        toast("Login Success")

    }

    override fun onFailure(message: String) {
        toast(message)

    }
}