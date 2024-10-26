package com.keepbang.lec19

class Person(
    val name: String,
    val age: Int,
) {
    operator fun component1(): String {
        return name
    }

    operator fun component2(): Int {
        return age
    }
}

fun main() {
    val person = Person("A", 100)
    val (name, age) = person
    println(name)
    println(age)
}