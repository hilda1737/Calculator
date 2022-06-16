package com.getfit.mycalculator4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var btnadd: Button
    lateinit var btnsubtract: Button
    lateinit var btnModulus:Button
    lateinit var btndivision: Button
    lateinit var tvdisplay: TextView
    lateinit var etNum1:TextInputEditText
    lateinit var tilNum1:TextInputLayout
    lateinit var tilNum22:TextInputLayout
    lateinit var etNum2:TextInputEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castview()

    }

    fun castview() {
        btnadd = findViewById(R.id.btnadd)
        btndivision = findViewById(R.id.btndivision)
        btnModulus=findViewById(R.id.btnModulus)
        btnsubtract = findViewById(R.id.btnsubtract)
        tvdisplay = findViewById(R.id.tvdisplay)
        etNum1= findViewById(R.id.etNum1)
        etNum2= findViewById(R.id.etNum2)
        tilNum1=findViewById(R.id.tilNum1)
        tilNum22=findViewById(R.id.tilNum22)

        btnsubtract.setOnClickListener {
            var number1 = etNum1.text.toString().toInt()
            var number2 = etNum2.text.toString().toInt()
            subtraction(number1, number2)
        }
        btnadd.setOnClickListener {
            var number1 = etNum1.text.toString().toInt()
            var number2 = etNum2.text.toString().toInt()
            addition(number1, number2)

        }
        btnModulus.setOnClickListener {
            var number1 = etNum1.text.toString().toInt()
            var number2 = etNum2.text.toString().toInt()
            modulus(number1, number2)


        }
        btndivision.setOnClickListener {
            var number1 = etNum1.text.toString().toInt()
            var number2 = etNum2.text.toString().toInt()
            divide(number1, number2)
        }


    }

     fun subtraction(number1: Int, number2: Int) {

         var minus = number1 - number2
         tvdisplay.text = minus.toString()
    }

    fun divide(number1: Int, number2: Int) {
        var minus = number1 / number2
        tvdisplay.text = minus.toString()

    }

    fun addition(number1: Int, number2: Int) {
        var minus = number1 + number2
        tvdisplay.text = minus.toString()
    }


    fun modulus(number1: Int, number2: Int) {
        var minus = number1 % number2
        tvdisplay.text = minus.toString()
    }

}