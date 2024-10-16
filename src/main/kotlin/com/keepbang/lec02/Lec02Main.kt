package com.keepbang.lec02

fun main() {
    val str: String? = "ABC" // null이 들어갈수 있는 변수
//    println(str.length) // 컴파일 에러 str이 null일 수 있기 때문에
    // safe call(?.)를 붙여서 실행하면 null일 경우 null을 반환하고 null이 아니면 length를 반환한다.
    println(str?.length)
    val str2: String? = null
    println(str2?.length)
    // elvis(엘비스)연산자를 사용하면 null일 경우 기본값을 출력 할 수 있다.
    println(str?.length ?: 1)
    println(str2?.length ?: 1)
}

// 기본적으로 코틀린 함수의 매개변수와 반환타입은 null이 들어갈 수 없다.
fun startsWith(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithNotNull(str: String?): Boolean {
    return str!!.startsWith("A") // '!!' 키워드로 str은 null이 절대 아니라고 알려줄 수 있다.
    // 이 경우 null이 들어오면 NPE가 발생한다.
}


// nul이 들어올 경우 매개변수 타입에 '?'가 붙어야한다.
fun startsWithA1(str: String?): Boolean { // null이 들어갈수 없는 반환 타입
//    if (str == null) {
//        throw IllegalArgumentException("nll이 들어왔습니다")
//    }
//    return str.startsWith("A")
    return str?.startsWith(str) ?: throw IllegalArgumentException("nll이 들어왔습니다")
}

// null이 반환될 수 있다면 반환 타입에도 '?'가 있어야한다.
fun startsWithA2(str: String?): Boolean? {
//    if (str == null) {
//        return null
//    }
//    return str.startsWith("A")

    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean { // null이 들어갈수 없는 반환 타입
//    if (str == null) {
//        return false
//    }
//    return str.startsWith("A")

    return str?.startsWith("A") ?: false
}