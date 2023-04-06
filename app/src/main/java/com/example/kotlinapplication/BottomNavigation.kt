package com.example.kotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import com.google.android.material.bottomnavigation.BottomNavigationView


class BottomNavigation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation_view)

        val frame = findViewById<FrameLayout>(R.id.fragmentFrame)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottomnavigtionview)
        bottomNavigation.setOnItemSelectedListener {
            if (it.itemId == R.id.search){
                fragment1()
            } else if (it.itemId == R.id.call){
                fragment2()
            } else{
                fragment3()
            }
            false
        }
    }

    private fun fragment3() {
        val fm3 = supportFragmentManager.beginTransaction()
        fm3.replace(R.id.fragmentFrame, BlankFragment3.newInstance())
        fm3.commit()
    }

    private fun fragment2() {
        val fm2 = supportFragmentManager.beginTransaction()
        fm2.replace(R.id.fragmentFrame, BlankFragment2.newInstance())
        fm2.commit()
    }

    private fun fragment1() {
        val fm1 = supportFragmentManager.beginTransaction()
        fm1.replace(R.id.fragmentFrame,BlankFragment1.newInstance())
        fm1.commit()

    }
}