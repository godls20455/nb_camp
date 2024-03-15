package com.example.shakeshack

class Side: Food() {
    val Fries = Menu("Fries", 6200)
    val CheeseFries = Menu("Cheese Fries", 6200)
    val sideList = listOf(Fries, CheeseFries)

    override fun displayMenu() {
        println("[ Side MENU ]")
        println("1. Fries         | W 4.8  | 바삭하고 담백한 프라이")
        println("2. Cheese Fries  | W 5.9  | 고소하고 진한 치즈 소스를 올린 프라이")
        println("0. 뒤로가기")

    }

}