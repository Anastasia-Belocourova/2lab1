package com.example.numbers1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun main(view: View) {
        var number1 = findViewById<EditText>(R.id.editTextNumber1).text.toString()
        var number2 = findViewById<EditText>(R.id.editTextNumber2).text.toString()

        if (!number1.equals("") && !number2.equals("")) {
            fun int (view: View): Int {
                return Integer.parseInt(number1)
                return Integer.parseInt(number2)
            }
            val res = when {
                (number1 == number2) -> {
                    val toast = Toast.makeText(this, "Введёные числа имеют одинаковые значения, т.е. $number1 = $number2", Toast.LENGTH_LONG)
                    toast.show()
                }
                else -> {
                    val toast = Toast.makeText(this, "Введёные числа имеют неодинаковые значения, т.е. $number1 ≠ $number2", Toast.LENGTH_LONG)
                    toast.show()
                }
            }
        }
        else {
            val toast = Toast.makeText(this, "Пожалуйста, заполните все поля", Toast.LENGTH_LONG).show()

        }
    }
}
