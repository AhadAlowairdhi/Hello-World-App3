package com.example.helloworldapp3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var txt : TextView
    lateinit var edn : EditText
    lateinit var save : Button
    lateinit var check : CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt = findViewById(R.id.tv1)
        edn = findViewById(R.id.edit1)
        save = findViewById(R.id.btn1)
        check = findViewById(R.id.checkBox)
    save.setOnClickListener {
        if (check.isChecked ){
            txt.setText("Hi ${edn.text} !")
            txt.setTextColor(Color.BLUE)
        }
    }

    }

}

