package com.hackerman.kotlincalculator

class Calculator {
    var state: Operator = Operator.add(0)

    fun onAction(fn: Operator) {
        state = fn
        display.text = ""
    }

    val currentValue: Long
        get() = when(display.text) {
            "" -> 0
            else -> display.text.toLong()
        }

    private fun operator(x: String) {
        if(Regex("[0-9]").matches(x)) {
            display.text = ""
        } else {
            when(x) {
                "+" -> onAction(Operator.plus(currentValue))
                "-" -> onAction(Operator.minus(currentValue))
                "*" -> onAction(Operator.mult(currentValue))
                "/" -> onAction(Operator.div(currentValue))
                "%" -> { onAction(Operator.div(currentValue)); operator("=") }
                "+/-" -> { onAction(Operator.add(-1*currentValue)); operator("=") }
                "C" -> onAction(Operator.div(currentValue))
                "=" -> display.text = state.calculate(currentValue).toString()
            }
        }

    }
}