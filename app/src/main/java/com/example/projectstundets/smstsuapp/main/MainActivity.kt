package com.example.projectstundets.smstsuapp.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.projectstundets.smstsuapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentManager.beginTransaction().replace(R.id.screen_main_placeholder, MainFragment.newInstance()).commit()

    }
}
