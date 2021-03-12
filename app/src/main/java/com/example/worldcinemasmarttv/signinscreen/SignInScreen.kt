package com.example.worldcinemasmarttv.signinscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.worldcinemasmarttv.R
import com.example.worldcinemasmarttv.mainscreen.MainScreen
import kotlinx.android.synthetic.main.activity_sign_in_screen.*

class SignInScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_screen)

        frameLayout1.setOnClickListener {
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        }
    }
}