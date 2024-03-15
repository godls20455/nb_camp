package com.example.calculator

fun main(){
    println("-----------------계산기 입니다-----------------")
    var exit = true
    while(exit == true) {
        println("계산하고 싶은 연산자를 선택하세요")
        println("[1]더하기 [2]빼기 [3]곱하기 [4]나누기 [-1]계산기 종료")
        var select = readLine()!!.toInt()

        if (select!=-1){
            numCal(select)
        } else {
            println("계산을 종료합니다")
            exit = false
        }
    }
}

fun numCal(select: Int) {
    println("계산하고 싶은 첫번째 숫자를 입력하세요")
    var num1 = readLine()!!.toInt()
    println("계산하고 싶은 두번째 숫자를 입력하세요")
    var num2 = readLine()!!.toInt()

    var addCal = AddOperation()
    var subCal = SubstractOperation()
    var mulCal = MultiplyOperation()
    var divCal = DivideOperation()

    if (select == 1) {
        addCal.calculate(num1, num2)
    } else if (select == 2) {
        subCal.calculate(num1, num2)
    } else if (select == 3) {
        mulCal.calculate(num1, num2)
    } else if (select == 4) {
        divCal.calculate(num1, num2)
    }
}