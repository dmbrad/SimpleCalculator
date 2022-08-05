package com.example.midmorningfirefoxcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var myAnswer: TextView? = null
    var myFnum: EditText? = null
    var mySnum: EditText? = null
    var buttonAdd: Button? = null
    var buttonSub: Button? = null
    var buttonDivide: Button? = null
    var buttonMultiply: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myAnswer = findViewById(R.id.mTvAnswer)
        myFnum = findViewById(R.id.medtFnum)
        mySnum = findViewById(R.id.mEdtSnum)
        buttonAdd = findViewById(R.id.MbtnAdd)
        buttonDivide = findViewById(R.id.MbtnDivide)
        buttonMultiply = findViewById(R.id.MbtnMultiply)
        buttonSub = findViewById(R.id.MbtnSubtract)
        ///set on click listeners on buttons
        buttonAdd!!.setOnClickListener {
            // Receive the two numbers from user
            var firstNumber = myFnum!!.text.toString().trim()
            var secondNumber = mySnum!!.text.toString().trim()
            ///Check if the user is entering empty fields
            if (firstNumber.isEmpty()) {
                //Set an error on the firstNumber
                myFnum!!.setError("Please fill this input")
                myFnum!!.requestFocus()

            } else if (secondNumber.isEmpty()) {
                //set an error on the second number
                mySnum!!.setError("Please fill this input")
                mySnum!!.requestFocus()

            } else {
                //proceed to calculate the two numbers
                var answer = firstNumber.toDouble() + secondNumber.toDouble()
                //Display the answer
                myAnswer!!.text = answer.toString()
            }
        }
        buttonSub!!.setOnClickListener {
            // Receive the two numbers from user
            var firstNumber = myFnum!!.text.toString().trim()
            var secondNumber = mySnum!!.text.toString().trim()
            ///Check if the user is entering empty fields
            if (firstNumber.isEmpty()) {
                //Set an error on the firstNumber
                myFnum!!.setError("Please fill this input")
                myFnum!!.requestFocus()

            } else if (secondNumber.isEmpty()) {
                //set an error on the second number
                mySnum!!.setError("Please fill this input")
                mySnum!!.requestFocus()

            } else {
                //proceed to calculate the two numbers
                var answer = firstNumber.toDouble() - secondNumber.toDouble()
                //Display the answer
                myAnswer!!.text = answer.toString()
            }
            buttonDivide!!.setOnClickListener {
                // Receive the two numbers from user
                var firstNumber = myFnum!!.text.toString().trim()
                var secondNumber = mySnum!!.text.toString().trim()
                ///Check if the user is entering empty fields
                if (firstNumber.isEmpty()) {
                    //Set an error on the firstNumber
                    myFnum!!.setError("Please fill this input")
                    myFnum!!.requestFocus()

                } else if (secondNumber.isEmpty()) {
                    //set an error on the second number
                    mySnum!!.setError("Please fill this input")
                    mySnum!!.requestFocus()

                } else {
                    //proceed to calculate the two numbers
                    var answer = firstNumber.toDouble() / secondNumber.toDouble()
                    //Display the answer
                    myAnswer!!.text = answer.toString()
                }
                buttonMultiply!!.setOnClickListener {
                    // Receive the two numbers from user
                    var firstNumber = myFnum!!.text.toString().trim()
                    var secondNumber = mySnum!!.text.toString().trim()
                    ///Check if the user is entering empty fields
                    if (firstNumber.isEmpty()) {
                        //Set an error on the firstNumber
                        myFnum!!.setError("Please fill this input")
                        myFnum!!.requestFocus()

                    } else if (secondNumber.isEmpty()) {
                        //set an error on the second number
                        mySnum!!.setError("Please fill this input")
                        mySnum!!.requestFocus()

                    } else {
                        //proceed to calculate the two numbers
                        var answer = firstNumber.toDouble() * secondNumber.toDouble()
                        //Display the answer
                        myAnswer!!.text = answer.toString()
                    }
                }
            }
        }
    }
}
