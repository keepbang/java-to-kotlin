package com.keepbang.lec19

fun main() {
    println(getNumberOrNull(0))
    println(getNumberOrNullV2(1))
}

fun getNumberOrNull(number: Int): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}

fun getNumberOrNullV2(number: Int): Int? {
    return number.takeIf { it > 0}
}

fun printPerson(person: Person?) {
    person?.let { // scope function의 한 종류
        println(it.name)
        println(it.age)
    }
    person?.run {  }
}