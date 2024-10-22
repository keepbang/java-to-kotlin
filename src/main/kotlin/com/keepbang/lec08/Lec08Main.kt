package com.keepbang.lec08

/**
 * 함수 사용 방법
 * 1. 함수 선언 문법
 * 2. default parameter
 * 3. named argument (parameter)
 * 4. 같은 타입의 여러 파라미터 받기(가변인자)
 */

fun main() {
    repeat("HELLO WORLD", 3, true)
    repeat("HELLO WORLD") // 위와 동일하게 구동됨

//    repeat("HELLO WORLD", false) // error -> 순서는 맞아야한다
    repeat("HELLO WORLD", useNewLine = false) // 이름있는 파라미터(named argument) builder와 비슷함

    printNameAndGender("keepbang", "남자")
    printNameAndGender(gender = "남자", name = "keepbang")
    // 자바코드를 가져오는것은 named argument를 사용 할 수 없다.

    printAll("A", "B", "C")
    val arr = arrayOf("D", "E", "F")

    printAll(*arr) // 배열을 바로 넣는 대신 스프레드 연산자 (*)을 붙여줘야 한다

}

// 두 정수를 받아 더 큰 정수를 반환하는 함수
// 간단한 함수는 줄여서 사용 가능하다.
fun max(a: Int, b: Int) = if (a > b) a else b

// default값을 입력 할 수 있다.
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

//fun repeat(str: String, num: Int) {
//    repeat(str, num, true)
//}

// named argument는 builder를 만들지 않고 builder처럼 사용 할 수 있다.
fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

// 문자를 여러개 받아올 경우
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}
