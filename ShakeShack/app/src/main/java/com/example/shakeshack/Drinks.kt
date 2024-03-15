package com.example.shakeshack

class Drinks: Food() {
    val Lemonade = Menu("Lemonade", 6200)
    val FountainSoda = Menu("Fountain Soda", 6200)
    val AbitaRootBeer = Menu("Abita Root Beer", 6200)
    val drinkList = listOf(Lemonade, FountainSoda, AbitaRootBeer)

    override fun displayMenu() {
        println("[ Drinks MENU ]")
        println("1. Lemonade         | S 3.8 | 매장에서 직접 만드는 상큼한 레몬에이드")
        println("2. Fountain Soda    | S 2.9 | 코카콜라, 스프라이트, 환타 오렌지")
        println("3. Abita Root Beer  | W 4.8 | 청량감있는 독특한 미국식 무알콜 탄산음료")
        println("0. 뒤로가기")

    }
}