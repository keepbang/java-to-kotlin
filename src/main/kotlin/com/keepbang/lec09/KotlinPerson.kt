package com.keepbang.lec09

import com.lannstark.lec09.JavaPerson

fun main() {
    val person = KotlinPerson("Keepbang", 30)
    println("${person.name}, ${person.age}")
    person.age = 50
    println("${person.name}, ${person.age}")

    val javaPerson = JavaPerson("hong", 20)
    println("${javaPerson.name}, ${javaPerson.age}")
    javaPerson.age = 50
    println("${javaPerson.name}, ${javaPerson.age}")

    val kotlinPerson = KotlinPerson("A")
    println("${kotlinPerson.name}, ${kotlinPerson.age}")
}

// constructor 생략 가능
// 생성자 안에 바로 프로퍼티를 추가 할 수 있음
// 위에 생성하는 생성자는 주 생성자(반드시 존재해야 한다)
class KotlinPerson(
    name: String,
    age: Int = 1 // default도 사용 가능
) { // 블록 제거도 가능

    // 프로퍼티 : getter와 setter를 자동으로 만들어줌
    // 아래 프로퍼티는 생략 가능
//    val name = name // 타입 생략 가능
//    var age = age

    // 클래스 생성 시점에 한번만 실행됨 PostConstructor와 비슷함
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 0보다 커야 합니다.")
        }
        println("초기화 블록")
    }

    // 또 다른 생성자는 아래에 생성(부생성자)
    // this로 생성해야한다.
    // 아래 부 생성자보다는 default parameter를 권장한다. 필요할 때에는 정적 팩토리 메소드를 사용한다.
    constructor(name: String): this(name, 1) {
        println("부생성자")
    }

    // 이름을 대문자로 변경
    // 자기 자신을 가르키는 field를 사용하여 처리한(backing field)
    val name: String = name
        get() = field.uppercase()

    var age: Int = age
        set(value) {
            field = value + 1
        }

    // 프로퍼티처럼 만들 수 있다.
    val isAdult: Boolean
        get() = this.age >= 20


//    val isAdult2: Boolean
//        get() {
//            return this.age >= 20
//        }
}