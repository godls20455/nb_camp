package com.example.calculator

class Calculator () {
    var answer: Int = 0

    fun add (num1: Int, num2: Int): Int {
        answer = num1 + num2
        return answer
    }

    fun substract (num1: Int, num2: Int): Int {
        answer = num1 - num2
        return answer
    }

    fun multiply (num1: Int, num2: Int): Int {
        answer = num1 * num2
        return answer
    }

    fun divide (num1: Int, num2: Int): Int {
        var num3 = num1.toDouble()
        var num4 = num2.toDouble()
        answer = (num3 / num4).toInt()
        return answer
    }

    fun remainder (num1: Int, num2: Int): Int {
        var num3 = num1 * 1.0
        var num4 = num2 * 1.0
        answer = (num3 % num4).toInt()
        return answer

    }
}