package com.example.shikhark.empoweru

import android.app.Activity
import android.widget.Toast

fun Activity.toast(content:String){
    Toast.makeText(this,content, Toast.LENGTH_SHORT).show()
}