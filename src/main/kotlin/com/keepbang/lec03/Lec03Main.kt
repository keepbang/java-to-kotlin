package com.keepbang.lec03

import com.lannstark.lec03.Person

fun main() {
    val number1 = Int.MAX_VALUE // int
    val number2 = Long.MAX_VALUE // long
    val number3 = 6.0f // float
    val number4 = 3.5 // double
    // 코틀린에서 타입변환은 명시적으로 이루어 져야 한다.
    // to변환타입()을 사용하여 변환해야한다.

    println(number1.javaClass)
    println(number2.javaClass)
    println(number3.javaClass)
    println(number4.javaClass)

    println(number2.toInt()) // 범위를 넘어가는 값을 타입변환하면 -1을 반환한다.

    /**
     * 코틀린에만 존재하는 타입 3가지
     * Any
     * - java의 Object 역할
     * - primitive type의 최상의 타입도 Any다.
     * - Any 자체로는 null을 포함할 수 없어 Any?로 표현
     * - Any에 equals, hashCode, toString 존재
     **/


    /**
     * Unit
     * - java의 void와 동일
     * - void와 다르게 Unit은 그 자체로 타입 인자로 사용 가능하다.
     * - 함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미.
     * - 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현
     */

    /**
     * Nothing
     * - Nothing은 함수가 정상적으로 끝나지 않았다는 사실을 표현하는 역할
     * - 무조건 예외를 반환하는 함수 / 무한 루프 함수 등
     */

    /**
     * String interpolation / String indexing
     * - ${} 를 사용하여 문자를 제어 만들 수 있다.(javascript와 비슷함)
     * - 여러줄에 걸친 문자열을 사용할 경우 큰따옴표 3개를 사용하여 만들 수 있다.
     */
    val person = Person("keepbang", 100)
    val age = person.age
    println("이름 : ${person.name}, 나이 : $age")

    val subStr = "QWER"

    val str = """
            ABC
          BCD
        $subStr
    """.trimIndent()
    /**
     * trimIndent
     * - 모든 입력 라인의 공통 최소 들여쓰기를 감지하고 모든 라인에서 그만큼 제거한다.
     * - 비어있는 첫번째와 마지막 라인 제거
     */

    println(str)
    println(subStr[0]) // 바로 배열로 사용 가능
    println(subStr[2])
}

fun printAgeIfPerson(obj: Any?) {
    // 만약 obj가 Person이 아니라면 !is를 사용하면 됨
    if (obj !is Person) {
        throw IllegalArgumentException("Not Person")
    }
    if (obj is Person) { // instanceof 대신 is 사용
        // if에서 타입체크를 하면 해당 타입으로 간주됨
//        val person = obj as Person // as {Class} Any를 변환가능(생략가능)
        println(obj.age)
    }
}