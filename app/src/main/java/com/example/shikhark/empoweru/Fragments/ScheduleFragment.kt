package com.example.shikhark.empoweru.Fragments

import android.app.Activity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shikhark.empoweru.MainActivity
import com.example.shikhark.empoweru.R
import com.example.shikhark.empoweru.toast

class ScheduleFragment: Fragment() {
    lateinit var activity: MainActivity
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        activity=activity as MainActivity
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_schedule,null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity.toast("From Schedule")
    }

    companion object {
        fun newInstance(): Fragment {
            return CoursesFragment()
        }
    }
}