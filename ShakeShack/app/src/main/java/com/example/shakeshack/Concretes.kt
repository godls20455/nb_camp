package com.example.shakeshack

class Concretes: Food() {
    val ShackAttack = Menu("ShackAttack", 6200)
    val Better2Gether = Menu("Better 2Gether", 6200)
    val ShackFfogato = Menu("Shack-ffogato", 6200)
    val CrunchStar = Menu("Crunch Star", 6200)
    val concreteList = listOf(ShackAttack, Better2Gether, ShackFfogato, CrunchStar)

    override fun displayMenu() {
        println("1. Shack Attack    | W 6.2 | 진한 초콜릿 커스터드에 퍼지소스가 블렌딩된 콘크리트")
        println("2. Better 2Gether  | W 6.2 | 바닐라와 초콜릿 커스터드를 반씩 넣은 콘크리트")
        println("3. Shack-ffogato   | W 6.2 | 바닐라 커스터드와 카라멜 소스가 어우러진 콘크리트")
        println("4. Crunch Star     | W 6.2 | 초콜릿 청크와 고소한 콩가루가 어우러진 콘크리트")
        println("0. 뒤로가기")

    }
}