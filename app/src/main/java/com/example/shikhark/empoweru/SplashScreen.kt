package com.example.shikhark.empoweru


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val context=this
        launch{
            delay(2000)
            val intent= Intent(context,MainActivity::class.java)
            startActivity(intent)
        }

    }
}
