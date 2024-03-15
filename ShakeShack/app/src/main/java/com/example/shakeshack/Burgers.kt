package com.example.shakeshack

class Burgers: Food() {
    val ShackBurger = Menu("ShackBurger", 8400)
    val SmokeShack = Menu("SmokeShack", 10600)
    val ShackStack = Menu("ShackStack", 8400)
    val Hamburger = Menu("Hamburger", 8400)
    val burgerList = listOf(ShackBurger, SmokeShack, ShackStack, Hamburger)

    override fun displayMenu() {
        println("[ Burgers MENU ]")
        println("1. ShackBurger  | W 8.4  | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
        println("2. SmokeShack   | W 10.6 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
        println("3. ShackStack   | W 14.8 | 포토벨로 버섯 패티, 토마토, 양상추가 토핑된 치즈버거")
        println("4. Hamburger    | W 6.8  | 비프패티를 기반으로 야채가 들어간 기본버거")
        println("0. 뒤로가기")
    }

}