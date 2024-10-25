package com.keepbang.lec16

import com.keepbang.obj.Person

fun main() {
    val str = "ABC"
    println(str.last())
    println(str.substring2(""))
    val num = 1
    println(num add 2)

    val person = Person("A", 100)
    person.nextYearAge(2)
}

infix fun Int.add(other: Int): Int = this + other

fun String.substring2(regex: String): String = this + regex


fun Person.nextYearAge(num: Int): Int {
    println("확장함수")
    return this.age + num
}