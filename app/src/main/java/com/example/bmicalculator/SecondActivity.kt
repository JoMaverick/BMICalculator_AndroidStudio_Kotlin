package com.example.bmicalculator

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.core.view.isNotEmpty
import kotlin.time.times

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val CalcBtn = findViewById<Button>(R.id.btn_Calc)
        val NameEd = findViewById<EditText>(R.id.editText_name)
        val GenderRadioGroup = findViewById<RadioGroup>(R.id.RadGrp_Gender)
        val HeightEd = findViewById<EditText>(R.id.editText_height)
        val WeightEd = findViewById<EditText>(R.id.editText_weight)

        CalcBtn.setOnClickListener {
            val name = NameEd.text.toString()
            val gender = GenderRadioGroup.findViewById<RadioButton>(GenderRadioGroup.checkedRadioButtonId).text.toString()
            val height = HeightEd.text.toString().toDouble()
            val weight = WeightEd.text.toString().toDouble()

            val bmi = calculateBMI(height/100,weight)

            val status = calculateBMIStatus(bmi)

            if(name.isNotEmpty() && gender.isNotEmpty() && height != null && weight != null){
                val bundle = Bundle()
                bundle.putString("name", name)
                bundle.putString("gender", gender)
                bundle.putDouble("BMIValue", bmi)
                bundle.putString("status", status)
                setResult(Activity.RESULT_OK, Intent().putExtras(bundle))
                finish()
            }else{
                Toast.makeText(this, "Data cannot be empty!!!",
                    Toast.LENGTH_LONG).show()
            }
        }

    }

    private fun calculateBMI(height: Double, weight: Double): Double {
        return weight / (height * height)
    }

    private fun calculateBMIStatus(bmi: Double): String {
        return when {
            bmi < 18.5 -> "Underweight"
            bmi >= 24 && bmi < 27 -> "Overweight"
            bmi >= 27 && bmi < 30 -> "Mild Obesity"
            bmi >= 30 && bmi < 35 -> "Moderate Obesity"
            else -> "Severe Obesity"
        }
    }
}