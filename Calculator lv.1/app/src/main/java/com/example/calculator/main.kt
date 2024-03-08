package com.example.calculator

fun main() {
    println("----------계산기 입니다----------")
    println("계산하고 싶은 연산자를 선택하세요")
    println("[1]더하기 [2]빼기 [3]곱하기 [4]나누기 [5]나머지 구하기")
    var select = readLine()!!.toInt()
    var selectList = listOf<String>("더하고", "빼고", "곱하고", "나누고")
    var selectString = ""
    when(select){
        1->{selectString=selectList[0]}
        2->{selectString=selectList[1]}
        3->{selectString=selectList[2]}
        4,5->{selectString=selectList[3] }
    }

    println("${selectString} 싶은 첫번째 숫자를 입력하세요")
    var num1 = readLine()!!.toInt()
    println("${selectString} 싶은 두번째 숫자를 입력하세요")
    var num2 = readLine()!!.toInt()
    var answer = 0

    when (select){
        1 -> {
            var calNum = Calculator()
            answer = (calNum.add(num1,num2))
            println(answer)
        }
        2 -> {
            var calNum = Calculator()
            answer = (calNum.substract(num1,num2))
            println(answer)
        }
        3 -> {
            var calNum = Calculator()
            println(calNum.multiply(num1,num2))
        }
        4 -> {
            var calNum = Calculator()
            println(calNum.divide(num1,num2))
        }
        5 -> {
            var calNum = Calculator()
            println(calNum.remainder(num1,num2))
        }
    }
    println("계산을 종료합니다"
}