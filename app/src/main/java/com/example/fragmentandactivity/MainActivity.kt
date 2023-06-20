package com.example.fragmentandactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnRed : Button
    lateinit var btnBlue : Button
    lateinit var btnGreen : Button
    lateinit var btnInt : Button
    lateinit var activityinterface: Activityinterface
    var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRed = findViewById(R.id.btnRed)
        btnBlue = findViewById(R.id.btnBlue)
        btnGreen = findViewById(R.id.btnGreen)
        btnInt = findViewById(R.id.btnInt)

        btnRed.setOnClickListener {
            activityinterface.redcolor()
        }
        btnBlue.setOnClickListener {
            activityinterface.bluecolor()
        }
        btnGreen.setOnClickListener {
            activityinterface.greencolor()
        }


    }
    fun UpdateNumber(){
        btnInt.text = number.toString()
    }
}
