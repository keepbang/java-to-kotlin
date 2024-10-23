package com.keepbang.lec10

interface Flyable {
    // default를 사용하지 않아도 default 함수를 사용할 수 있다.
    fun act() {
        println("파닥 파닥")
    }

    // 추상 매소드
//    fun fly()
}