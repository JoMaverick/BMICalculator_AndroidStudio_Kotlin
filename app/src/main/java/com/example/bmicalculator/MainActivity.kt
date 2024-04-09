package com.example.bmicalculator

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btn_inputData).setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivityForResult(intent, 1)
        }


        val bmiInfoButton = findViewById<Button>(R.id.btn_BMIInfo)

        bmiInfoButton.setOnClickListener {
            startActivityForResult(Intent(this, ThirdActivity::class.java), 1)
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        data?.extras?.let {
            if (requestCode == 1 && resultCode == Activity.RESULT_OK){
                findViewById<TextView>(R.id.tv_name).text = "Name: ${it.getString("name")}"
                findViewById<TextView>(R.id.tv_gender).text = "Gender: ${it.getString("gender")}"
                findViewById<TextView>(R.id.tv_bmiValue).text = "BMI Value: ${it.getDouble("BMIValue")}"
                findViewById<TextView>(R.id.tv_status).text = "Status: ${it.getString("status")}"
            }

        }



    }


}