package com.example.projectstundets.smstsuapp.auth.splashScreen

import android.os.Bundle
import android.app.Fragment
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import com.example.projectstundets.smstsuapp.R
import com.example.projectstundets.smstsuapp.auth.loginScreen.LoginFragment
import kotlinx.android.synthetic.main.fragment_splash.*

class SplashFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val handler = Handler()
        handler.post {
            handler.postDelayed({
                        endSplashScreen()
            }, 2500)
        }

        return inflater.inflate(R.layout.fragment_splash, container, false)

    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iv_splash_icon.startAnimation(AnimationUtils.loadAnimation(activity.applicationContext, R.anim.anim_fade_in))
    }

    private fun endSplashScreen(){

        activity.fragmentManager.beginTransaction().replace(R.id.screen_auth_placeholder, LoginFragment.newInstance()).commit()
    }

    companion object { @JvmStatic fun newInstance() = SplashFragment() }
}
