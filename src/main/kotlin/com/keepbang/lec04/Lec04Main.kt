package com.keepbang.lec04

import com.lannstark.lec04.JavaMoney

/**
 * 연산자
 * 1. 단항 연산자 / 산술 연산자 -> 자바와 동일함
 * 2. 비교 연산자와 동등성, 동일성
 * 3. 논리 연산자(자바와 동일함) / 코틀린에 있는 특이한 연산자
 * 4. 연산자 오버로딩
 */
fun main() {
    // 단항 연산자 / 산술 연산자 완전 동일
    // 비교연산자
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    // 코틀린에서는 비교 연산자를 사용하면 자동으로 compareTo메소드를 실행한다.
    if (money1 > money2) {
        println("money1이 money2보다 크다.")
    }
    // 동등성(두객체의 값이 같은가), 동일성(같은 객체인가? 주소가 같은가?)
    // 자바에서 == 은 동등성은 검증 할 수 없다.
    // 코틀린에서는 동일성에 ===을 사용하고 동등성에 ==을 사용한다. ==을 사용하면 간접적으로 equals를 호출한다.
    val m1 = JavaMoney(1_000L)
    val m2 = m1
    val m3 = JavaMoney(1_000L)

    println(m1 === m2) // 주소가 같음
    println(m1 === m3) // 주소가 다름
    // 논리연산자의 경우에도 자바와 동일하다.

    // 코틀린에만 존재하는 특이한 연산자
    /**
     * in / !in
     * - 컬렉션이나 범위에 포함되어 있다. 포함되어 있지 않다
     * a..b
     * - a부터 b 까지의 범위 객체를 생성한다
     * a[i]
     * - a에서 특정 index i로 값을 가져온다
     * a[i] = b
     * - a의 특정 index i에 b를 넣는다.
     */

    // 연산자 오버로딩 : 객체마다 연산자를 직접 구현할 수 있다.
    println(m1 + m2) // 해당 메소드로 이동됨

}