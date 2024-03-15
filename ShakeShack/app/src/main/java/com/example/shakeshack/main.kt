@file:Suppress("NAME_SHADOWING")

package com.example.shakeshack

fun main() {
    //클래스 불러오기
    val entireMenu = Food()
    val burgerMenu = Burgers()
    val sideMenu = Side()
    val concreteMenu = Concretes()
    val drinkMenu = Drinks()
    val pay = Pay()
    var select: Int

    pay.checkBudget() //보유한 현금 확인하기

    while (true) {
        entireMenu.displayMenu() //메뉴 불러오기
        select = readLine()!!.toInt() //!!!예외처리하기!!! -> 숫자만 입력받는 반복문 만들기 실패
        when (select) {
            1 -> { //1번. Burger
                burgerMenu.displayMenu()
                println("구매할 메뉴를 선택하세요")
                select = readLine()!!.toInt()
                if (select == 0) {
                    continue
                } else {
                    pay.menuSelected.add(burgerMenu.burgerList[select-1])
                    println("추가할 메뉴를 선택하세요")
                    continue
                }
            }

            2 -> { //2번. Side
                sideMenu.displayMenu()
                println("구매할 메뉴를 선택하세요")
                select = readLine()!!.toInt()
                if (select == 0) {
                    continue
                } else {
                    pay.menuSelected.add(sideMenu.sideList[select-1])
                    println("추가할 메뉴를 선택하세요")
                    continue
                }
            }

            3 -> { //3번. Comcrete
                concreteMenu.displayMenu()
                println("구매할 메뉴를 선택하세요")
                select = readLine()!!.toInt()
                if (select == 0) {
                    continue
                } else {
                    pay.menuSelected.add(concreteMenu.concreteList[select-1])
                    println("추가할 메뉴를 선택하세요")
                    continue
                }
            }

            4 -> { //4번. Drink
                drinkMenu.displayMenu()
                println("구매할 메뉴를 선택하세요")
                select = readLine()!!.toInt()
                if (select == 0) {
                    continue
                } else {
                    pay.menuSelected.add(drinkMenu.drinkList[select-1])
                    println("추가할 메뉴를 선택하세요")
                    continue
                }
            }

            0 -> { //0번. 프로그램 종료
                println("종료합니다")
                break
            }

            -1 -> { //-1번. 계산하기
                pay.showSelectedMenu()
                break
            }
        }
    }
    pay.order() //주문하기
}





