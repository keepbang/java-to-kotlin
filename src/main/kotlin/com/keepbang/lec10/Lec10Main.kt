package com.keepbang.lec10

/**
 * 코틀린에서 상속
 * 1. 추상 클래스
 * 2. 인터페이스
 * 3. 클래스를 상속할 때 주의해야할 사항
 * 4. 상속관련 지시어
 */
fun main() {
    val derived = Derived(10)
    val derived2 = Derived2(20)
    strategy(derived)
    strategy(derived2)
    val base = Base(300)
    strategy(base)

}

fun strategy(derived: Base) = when(derived) {
    is Derived -> println("version 1")
    is Derived2 -> println("version 2")
    else -> println("other version")
}