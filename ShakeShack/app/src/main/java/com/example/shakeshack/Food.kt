package com.example.shakeshack

open class Food {
    data class Menu(val name: String, val price:Int)

    open fun displayMenu() {
        println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.")
        println("[ SHAKESHACK MENU ]")
        println("1. Burgers    | 쉐이크쉑의 시그니처 피프 패티의 버거")
        println("2. Side       | 바삭하게 튀겨낸 짭짤한 프라이")
        println("3. Concretes  | 쫀득하고 진한 맛의 커스터드와 다양한 믹스-인이 만난 디저트")
        println("4. Drinks     | 매장에서 직접 만드는 음료")
        println("0. 프로그램 종료")
        println("-1. 계산하기")
    }
}