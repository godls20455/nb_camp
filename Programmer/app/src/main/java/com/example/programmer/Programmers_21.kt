package com.example.programmer

class Programmers_21 {
    fun solution(x: Int): Boolean {
        var num1 = x.toString().toCharArray()
        var numAnswer = 0
        var answer = false
        for (i in 0 until num1.size){
            var num = i
            numAnswer += num1[i].toInt()
        }
        if (x%numAnswer == 0) {answer = true}
        return answer
    }
}
println(solution(18))

//fun solution(x: Int): Boolean {
//    var answer = true
//    return answer
//}