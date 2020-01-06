package com.hackerman.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         * ПОЛУЧАЕМ ДОСТУП К КНОПКАМ
         */

        // Цифры
        val calcOne = findViewById<TextView>(R.id.calcOne)
        val calcTwo = findViewById<TextView>(R.id.calcTwo)
        val calcThree = findViewById<TextView>(R.id.calcThree)
        val calcFour = findViewById<TextView>(R.id.calcFour)
        val calcFive = findViewById<TextView>(R.id.calcFive)
        val calcSix = findViewById<TextView>(R.id.calcSix)
        val calcSeven = findViewById<TextView>(R.id.calcSeven)
        val calcEight = findViewById<TextView>(R.id.calcEight)
        val calcNine = findViewById<TextView>(R.id.calcNine)
        val calcZero = findViewById<TextView>(R.id.calcZero)

        // Операторы
        val calcPlus = findViewById<TextView>(R.id.calcPlus)
        val calcMinus = findViewById<TextView>(R.id.calcMinus)
        val calcMultiple = findViewById<TextView>(R.id.calcMultiple)
        val calcDiv = findViewById<TextView>(R.id.calcDiv)
        val calcRemainder = findViewById<TextView>(R.id.calcRemainder)
        val calcSwitch = findViewById<TextView>(R.id.calcSwitch)
        val calcC = findViewById<TextView>(R.id.calcC)

        // Поля вывода
        val calcExpression = findViewById<TextView>(R.id.calcExpression)
        val calcResult = findViewById<TextView>(R.id.calcResult)

        fun onAction(value: String, isNumber: Boolean) {
            if(isNumber) {
                calcResult.text = ""
                calcExpression.append(value)
            } else {
                calcExpression.append(calcResult.text)
                calcExpression.append(value)
                calcResult.text = ""
            }
        }

        /**
         * НАВЕШИВАЕМ СЛУШАТЕЛИ
         */

        // Цифры
        calcZero.setOnClickListener { onAction("0", true) }
        calcOne.setOnClickListener { onAction("1", true) }
        calcTwo.setOnClickListener { onAction("2", true) }
        calcThree.setOnClickListener { onAction("3", true) }
        calcFour.setOnClickListener { onAction("4", true) }
        calcFive.setOnClickListener { onAction("5", true) }
        calcSix.setOnClickListener { onAction("6", true) }
        calcSeven.setOnClickListener { onAction("7", true) }
        calcEight.setOnClickListener { onAction("8", true) }
        calcNine.setOnClickListener { onAction("9", true) }


    }
}
