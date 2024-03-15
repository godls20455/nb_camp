package com.example.calculator

class AddOperation: Calculator() {
    override fun calculate (num1:Int, num2:Int) {
        var answer = num1 + num2
        println("결과값은 $answer 입니다")
    }
}