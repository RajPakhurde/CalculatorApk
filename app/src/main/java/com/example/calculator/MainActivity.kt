package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstValue: EditText
        val secondValue: EditText
        val resultAns: TextView
        val btnAdd: Button
        val btnSub: Button
        val btnMulti: Button
        val btnDiv: Button

        firstValue = findViewById(R.id.firstValue)
        secondValue = findViewById(R.id.secondValue)
        resultAns = findViewById(R.id.resultAns)
        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnMulti = findViewById(R.id.btnMulti)
        btnDiv = findViewById(R.id.btnDiv)

        btnAdd.setOnClickListener{
            var firstIntValue: Int
            var secondIntValue: Int
            var resultOfCalculation: Int

            if(TextUtils.isEmpty(firstValue.text.toString())){
                resultAns.setText("First value is empty")
            }else if (TextUtils.isEmpty(secondValue.text.toString())){
                resultAns.setText(("Second value is empty"))
            }else if(true){
                firstIntValue = Integer.parseInt(firstValue.text.toString())
                secondIntValue = Integer.parseInt(secondValue.text.toString())

                resultOfCalculation = firstIntValue + secondIntValue

                resultAns.setText("Ans: $firstIntValue + $secondIntValue = $resultOfCalculation")
            }
        }

        btnSub.setOnClickListener{
            var firstIntValue: Int
            var secondIntValue: Int
            var resultOfCalculation: Int

            if(TextUtils.isEmpty(firstValue.text.toString())){
                resultAns.setText("First value is empty")
            }else if (TextUtils.isEmpty(secondValue.text.toString())){
                resultAns.setText(("Second value is empty"))
            }else if(true){
                firstIntValue = Integer.parseInt(firstValue.text.toString())
                secondIntValue = Integer.parseInt(secondValue.text.toString())

                resultOfCalculation = firstIntValue - secondIntValue

                resultAns.setText("Ans: $firstIntValue - $secondIntValue = $resultOfCalculation")
            }
        }

        btnMulti.setOnClickListener{
            var firstIntValue: Int
            var secondIntValue: Int
            var resultOfCalculation: Int

            if(TextUtils.isEmpty(firstValue.text.toString())){
                resultAns.setText("First value is empty")
            }else if (TextUtils.isEmpty(secondValue.text.toString())){
                resultAns.setText(("Second value is empty"))
            }else if(true){
                firstIntValue = Integer.parseInt(firstValue.text.toString())
                secondIntValue = Integer.parseInt(secondValue.text.toString())

                resultOfCalculation = firstIntValue * secondIntValue

                resultAns.setText("Ans: $firstIntValue x $secondIntValue = $resultOfCalculation")
            }
        }

        btnDiv.setOnClickListener{
            var firstIntValue: Int
            var secondIntValue: Int
            var resultOfCalculation: Int

            if(TextUtils.isEmpty(firstValue.text.toString())){
                resultAns.setText("First value is empty")
            }else if (TextUtils.isEmpty(secondValue.text.toString())){
                resultAns.setText(("Second value is empty"))
            }else if(true){
                firstIntValue = Integer.parseInt(firstValue.text.toString())
                secondIntValue = Integer.parseInt(secondValue.text.toString())

                resultOfCalculation = firstIntValue / secondIntValue

                resultAns.setText("Ans: $firstIntValue / $secondIntValue = $resultOfCalculation")
            }
        }


    }
}