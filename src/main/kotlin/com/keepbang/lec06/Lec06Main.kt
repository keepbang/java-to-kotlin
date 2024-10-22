package com.keepbang.lec06

/**
 * 반복문
 * 1. for-each 문 (향상된 for문)
 * 2. 전통적인 for 문
 * 3. Progression과 Range
 * 4. while 문
 */
fun loop1() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (number in numbers) { // 콜론 대신 in을 사용함
        println(number)
    }
}

fun main() {
    /**
     * 1..5 식은 IntRange를 만들어 주는 식이다.(등차수열을 만들어줌)
     * downTo와 step은 중위 호출 함수이다.
     */

    // 1 ~ 3 까지(include)
    for (i in 1..5) {
        print(i)
    }

    println()

    // 5 ~ 1 까지
    for (i in 5 downTo 1) {
        print(i)
    }

    println()

    // 1 ~ 5까지 2씩 올라감
    // step은 양수만 가능
    for (i in 1..5 step 2) {
        print(i)
    }

    println()

    // 1 ~ 4까지 출력
    for (i in 1 until 5) { // until은 이전값까지
        print(i)
    }

    println()

    // while문은 동일함
    var i = 1
    while(i in 1..10) {
        println(i++)
    }


}