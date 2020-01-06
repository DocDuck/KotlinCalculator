package com.hackerman.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

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
        val calcOpen = findViewById<TextView>(R.id.calcOpen)
        val calcClose = findViewById<TextView>(R.id.calcClose)
        val calcC = findViewById<TextView>(R.id.calcC)

        // Поля вывода
        val calcExpression = findViewById<TextView>(R.id.calcExpression)
        val calcResult = findViewById<TextView>(R.id.calcResult)

        fun appendExpression(value: String, isNumber: Boolean) {
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
         * При нажатии на кнопку будет добавляться значение кнопки в поле выражения
         */

        // Цифры
        calcZero.setOnClickListener { appendExpression("0", true) }
        calcOne.setOnClickListener { appendExpression("1", true) }
        calcTwo.setOnClickListener { appendExpression("2", true) }
        calcThree.setOnClickListener { appendExpression("3", true) }
        calcFour.setOnClickListener { appendExpression("4", true) }
        calcFive.setOnClickListener { appendExpression("5", true) }
        calcSix.setOnClickListener { appendExpression("6", true) }
        calcSeven.setOnClickListener { appendExpression("7", true) }
        calcEight.setOnClickListener { appendExpression("8", true) }
        calcNine.setOnClickListener { appendExpression("9", true) }
        // Выражения
        calcPlus.setOnClickListener { appendExpression("+", false) }
        calcMinus.setOnClickListener { appendExpression("-", false) }
        calcMultiple.setOnClickListener { appendExpression("*", false) }
        calcDiv.setOnClickListener { appendExpression("/", false) }
        calcRemainder.setOnClickListener { appendExpression("%", false) }
        calcOpen.setOnClickListener { appendExpression("(", false) }
        calcClose.setOnClickListener { appendExpression(")", false) }


    }
}
