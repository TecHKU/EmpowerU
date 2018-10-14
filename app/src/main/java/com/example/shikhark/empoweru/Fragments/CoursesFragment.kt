package com.example.shikhark.empoweru.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shikhark.empoweru.Adapters.CoursesAdapters
import com.example.shikhark.empoweru.MainActivity
import com.example.shikhark.empoweru.R
import kotlinx.android.synthetic.main.fragment_courses.*

class CoursesFragment:Fragment(){
    lateinit var viewAdapter: RecyclerView.Adapter<*>
    lateinit var viewManager: RecyclerView.LayoutManager
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_courses,null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewManager=LinearLayoutManager(activity)
        viewAdapter=CoursesAdapters()
        recyclerView.apply {
            layoutManager=viewManager
            adapter=viewAdapter
        }


    }

    companion object {
        fun newInstance(): Fragment {
            return CoursesFragment()
        }
    }

}