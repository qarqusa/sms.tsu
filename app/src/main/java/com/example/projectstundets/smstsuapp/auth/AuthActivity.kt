package com.example.projectstundets.smstsuapp.auth

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.projectstundets.smstsuapp.R
import com.example.projectstundets.smstsuapp.auth.splashScreen.SplashFragment

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        fragmentManager.beginTransaction().replace(R.id.screen_auth_placeholder, SplashFragment.newInstance()).commit()

    }
}
