package com.example.bmicalculator

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        //fragment
        val adapter = ViewPagerAdapter(supportFragmentManager)
        //link Adapter，create linkage among Fragments and ViewPager
        findViewById<ViewPager>(R.id.viewPager).adapter = adapter


//        val backButton = findViewById<Button>(R.id.btn_back)
//        backButton.setOnClickListener {
//            finish()
//        }
    }

    class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

        override fun getItem(position: Int) = when (position) {
            0 -> FirstFragment()   //First Fragment
            1 -> SecondFragment()  //Second Fragment
            else -> ThirdFragment() //Third Fragment
        }

        //return the numbers of Fragment
        override fun getCount() = 3
    }
}