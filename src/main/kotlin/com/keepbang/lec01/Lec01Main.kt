package com.keepbang.lec01

import com.keepbang.obj.Person

/**
 * @see com.lannstark.lec01.Lec01Main convert kotlin
 */
fun main() {
    // 변수 선언은 var, val를 통해 선언 가능
    var number1 = 10L // 가변 변수
    val number2 = 10L // 불변 변수

    // 타입 추론으로 변수의 타입을 지정함

    number1 = 20L // 가능
//        number2 = 20L  컴파일 에러

    var number3: Long = 1_000L

    //---------------------------------------

    // null 허용하는 변수
    var number4: Long = 10L
//        number4 = null // 기본적으로 null이 허용되지 않는 변수로 선언됨

    var number5: Long? = 10L; // '?' 키워드를 사용하여 null을 허용할 수 있음
    number5 = null

    //---------------------------------------
    var person = Person("keepbang")
    /**
     * new 키워드를 사용하지 않고 객체 생성해야함
     */
    println(person.name) // get을 안만들어도 값 조회 가능(java record와 동일함)
}