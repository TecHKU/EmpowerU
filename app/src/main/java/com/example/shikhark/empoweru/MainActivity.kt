package com.example.shikhark.empoweru

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.coroutines.experimental.android.UI
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        launch(UI) {
            delay(5000)
            toast("Hi Manvi")
        }


    }




}


fun Activity.toast(content:String){
    Toast.makeText(this,content,Toast.LENGTH_SHORT).show()
}