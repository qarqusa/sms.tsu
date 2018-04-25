package com.example.projectstundets.smstsuapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentManager.beginTransaction().replace(R.id.screen_main_placeholder, SplashFragment.newInstance()).commit()

        val handler = Handler()
        handler.post {
            handler.postDelayed({endSplashScreen()},5000)
        }
    }
    private fun endSplashScreen(){
        fragmentManager.beginTransaction().replace(R.id.screen_main_placeholder, MainFragment.newInstance()).commit()
    }
}
