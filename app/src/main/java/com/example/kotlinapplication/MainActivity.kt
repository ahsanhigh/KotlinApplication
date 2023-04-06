package com.example.kotlinapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btnWhatsapp: Button
    lateinit var urlString: String
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnWhatsapp = findViewById(R.id.whatsappbutton)

        btnWhatsapp.setOnClickListener {
            shareWahtsapp()

        }

        val check1 = findViewById<CheckBox>(R.id.mainCheckbox)
        val check2 = findViewById<CheckBox>(R.id.mainCheckbox2)

        val button = findViewById<Button>(R.id.btn1)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)

            Toast.makeText(this, "Move To Next Activity", Toast.LENGTH_LONG).show()

            startActivity(intent)

//            if (check1.isChecked== true && check2.isChecked==true){
//                Toast.makeText(this, "Both is checked", Toast.LENGTH_SHORT).show()
//            } else if (check1.isChecked==true){
//                Toast.makeText(this, "Check 1 is Clicked", Toast.LENGTH_SHORT).show()
//            } else if( check2.isChecked== true) {
//
//                Toast.makeText(this, " Check2 is Clicked", Toast.LENGTH_SHORT).show()
//            } else( check1.isChecked==false && check2.isChecked== false)
//                Toast.makeText(this, "Please Click On Any Option", Toast.LENGTH_SHORT).show()
        }

        val switch = findViewById<Switch>(R.id.switchbtn)
        switch.setOnClickListener {
            if (switch.isChecked) {
                Toast.makeText(this, "Switch is On", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Switch is Off", Toast.LENGTH_SHORT).show()
            }
        }

        val etValue = findViewById<EditText>(R.id.etMain)
        val btnValue = findViewById<Button>(R.id.btnEdit)
        val textMain = findViewById<TextView>(R.id.textViewMain)

        btnValue.setOnClickListener {
            val text = etValue.text
            textMain.setText(text)
        }

        val btn3 = findViewById<Button>(R.id.btnmenu)
        btn3.setOnClickListener {
            val Intent = Intent(this@MainActivity, MainActivity3::class.java)
            startActivity(Intent)
        }

        val btn4 = findViewById<Button>(R.id.btn4)
        btn4.setOnClickListener {
            val i = Intent(this@MainActivity, MainActivity4::class.java)
            startActivity(i)
        }

        val btn5 = findViewById<Button>(R.id.btn5)
        btn5.setOnClickListener {
            val i = Intent(this@MainActivity, BottomNavigation::class.java)
            startActivity(i)
        }
    }

    fun shareWahtsapp(){
        try {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = " text/plain"
            urlString = "Subsccribe my channal"
            intent.putExtra(Intent.EXTRA_TEXT,urlString)
            intent.`package`="com.facebook.katana"
        }catch (exp:Exception){
            Toast.makeText(applicationContext, " WhatsApp Not Installed", Toast.LENGTH_SHORT).show()
        }
    }
}