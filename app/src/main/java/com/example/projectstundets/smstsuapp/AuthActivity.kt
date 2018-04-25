package com.example.projectstundets.smstsuapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val handler = Handler()
        handler.post {
            handler.postDelayed({endSplashScreen()},2000)
        }
    }
    private fun endSplashScreen(){
        startActivity(Intent(this, MainActivity::class.java))
    }
}
