package com.keepbang.lec14

fun main() {
    val dto1 = PersonDto("A", 100)
    val dto2 = PersonDto("A", 100)
    println(dto1 == dto2)
    println(dto1)

    val person1 = Person("B", 100)
    val person2 = Person("B", 100)
    println(person1 == person2)
    println(person1)
}

