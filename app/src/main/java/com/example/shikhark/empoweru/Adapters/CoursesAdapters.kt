package com.example.shikhark.empoweru.Adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shikhark.empoweru.MainActivity
import com.example.shikhark.empoweru.Model.Course
import com.example.shikhark.empoweru.R
import java.util.ArrayList

class CoursesAdapters:RecyclerView.Adapter<CustomViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_courses_recycler_view, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 30
    }

    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {
        println("whegfjklr;")
    }

}

class CustomViewHolder(val view: View) : RecyclerView.ViewHolder(view)