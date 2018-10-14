package com.example.shikhark.empoweru

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.shikhark.empoweru.Fragments.CoursesFragment
import com.example.shikhark.empoweru.Fragments.ForumsFragment
import com.example.shikhark.empoweru.Fragments.NewsFragment
import com.example.shikhark.empoweru.Fragments.ScheduleFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var listOfFragments=ArrayList<Fragment>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottom_menu.selectedItemId=R.id.courses
        populateFragments()
        openFragment(listOfFragments[1])
        bottom_menu.setOnNavigationItemSelectedListener {
            when(it.title){
                "Courses"->{
                    openFragment(listOfFragments[0])
                    return@setOnNavigationItemSelectedListener  true
                }
                "Schedule"->{
                    openFragment(listOfFragments[1])
                    return@setOnNavigationItemSelectedListener  true
                }
                "News"->{
                    openFragment(listOfFragments[2])
                    return@setOnNavigationItemSelectedListener  true
                }
                "Forums"->{
                    openFragment(listOfFragments[3])
                    return@setOnNavigationItemSelectedListener  true
                }else->{
                println("Else being called")
                return@setOnNavigationItemSelectedListener false
                }
            }
        }


    }


    /**
     * Adds instances of fragments to the fragment list for bottom nav view
     */
    private fun populateFragments(){
        listOfFragments.add(CoursesFragment.newInstance())
        listOfFragments.add(ScheduleFragment.newInstance())
        listOfFragments.add(NewsFragment.newInstance())
        listOfFragments.add(ForumsFragment.newInstance())
    }



    /**
     * For opening fragments, again used for bottom nav
     */
    private fun openFragment(frag:Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        println("Opening fragment called with ${frag::class.java}")
        when (frag) {
            is CoursesFragment -> {
                transaction.replace(R.id.fragmentHolder,frag)
                supportActionBar?.title="Courses"
            }
            is ScheduleFragment -> {
                transaction.replace(R.id.fragmentHolder,frag)
                supportActionBar?.title="Schedule"
            }
            is NewsFragment -> {
                transaction.replace(R.id.fragmentHolder,frag)
                supportActionBar?.title="News"
            }
            is ForumsFragment->{
                transaction.replace(R.id.fragmentHolder,frag)
                supportActionBar?.title="Forums"
            }
            else -> {
                transaction.replace(R.id.fragmentHolder,listOfFragments[0])
                supportActionBar?.title="Courses"
            }
        }
        transaction.addToBackStack(null)
        transaction.commit()
    }




}


