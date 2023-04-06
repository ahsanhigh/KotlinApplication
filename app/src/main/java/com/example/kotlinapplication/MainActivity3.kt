package com.example.kotlinapplication

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupMenu

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val layout3 = findViewById<LinearLayout>(R.id.main3)
        val btnclick = findViewById<Button>(R.id.btnClick)

        btnclick.setOnClickListener {
            val popupmenu = PopupMenu(this@MainActivity3,btnclick)
            popupmenu.menuInflater.inflate(R.menu.popup_menu, popupmenu.menu)
            popupmenu.setOnMenuItemClickListener( object : PopupMenu.OnMenuItemClickListener{
                override fun onMenuItemClick(item: MenuItem?): Boolean {

                    when (item!!.itemId){
                        R.id.red -> layout3.setBackgroundColor(Color.parseColor("red"))
                        R.id.green -> layout3.setBackgroundColor(Color.parseColor("green"))
                        R.id.yellow -> layout3.setBackgroundColor(Color.parseColor("yellow"))
                    }
                    return true
                }
            })
            popupmenu.show()
        }
    }
}