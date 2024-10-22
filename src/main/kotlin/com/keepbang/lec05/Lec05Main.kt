package com.keepbang.lec05

import com.keepbang.lec04.KotlinMoney

/**
 * 1. if 문
 * 2. Expression과 Statement
 * 3. switch와 when
 */
fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score} 는 0보다 작을 수 없습니다.")
    }

    // score가 0부터 100 범위 안에 있지 않을 경우
    if (score !in 0..100) {
        throw IllegalArgumentException("${score} 는 0보다 작을 수 없습니다.")
    }

    // score가 0부터 100 사이의 값인 경우
    if (score in 0..100) {
        print("${score} 가 0부터 100 사이의 값입니다.")
    }

}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        return "A"
    } else if (score >= 80) {
        return "B"
    } else if (score >= 70) {
        return "C"
    } else {
        return "D"
    }
}

// 코틀린에서는 switch대신 when 사용
fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwitch2(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..89 -> "C"
        else -> "D"
    }

}

/**
 * when (값) {
 * 조건부 -> 어떠한 구문
 * 조건부 -> 어떠한 구문
 * else -> 어떠한 구문
 *
 * 조건부에는 is를 사요할 수 있다. (전략 패턴 사용가능)
 */
fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        is KotlinMoney -> obj.amount > 1000
        else -> false
    }
}

// 여러 조건을 추가할 수 있음
fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("1,0,-1 중 하나입니다.")
        else -> println("1,0,-1 이 아닙니다.")
    }
}

// when에 값이 안들어가도 된다.
fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("짝수")
        else -> println("홀수")
    }
}

fun main() {

}