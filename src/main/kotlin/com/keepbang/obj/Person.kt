package com.keepbang.obj

/**
 * @see com.lannstark.lec01.Person convert kotlin
 */
class Person(
    val name: String,
    var age: Int,
) {
    fun nextYearAge(): Int {
        println("멤버 함수")
        return this.age + 1
    }
}