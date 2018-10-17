package com.example.shikhark.empoweru

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import com.example.shikhark.empoweru.Fragments.CoursesFragment
import kotlinx.android.synthetic.main.activity_login_alt.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }
}