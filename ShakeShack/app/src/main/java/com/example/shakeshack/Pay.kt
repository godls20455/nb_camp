package com.example.shakeshack

class Pay: Food() {
    var menuSelected = mutableListOf<Menu>()
    var money: Int = 0
    var price: Int = 0

    fun checkBudget(){
        println("현재 보유한 현금을 입력하세요")
        money = readLine()!!.toInt()
        println("현재 보유한 현금은 ${money}원 입니다.")
    }

    fun showSelectedMenu() {
        println("----------------주문확인----------------")
        println("주문하신 메뉴는 ${menuSelected.size}개로 아래와 같습니다.")
        for (i in 0 until menuSelected.size){
            println(menuSelected[i].name)
            price += menuSelected[i].price
        }
        println("결제할 금액은 ${price}원 입니다")
    }

    fun order() {
        var compare = money - price
        println("----------------금액확인----------------")
        if (compare < 0){
            println("현재 보유한 현금보다 큰 금액의 음식을 주문했습니다.")
            println("다시 주문하시겠습니까?")
            println("[1]네 [2]아니오")
            var num = readLine()!!.toInt()
            if (num==1){
                main()
            } else println("주문을 종료하겠습니다.")
        } else {
            println("주문이 완료되었습니다.")
            println("남은 현금은 ${compare}원 입니다")
        }
    }
}