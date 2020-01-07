package com.hackerman.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
