package com.keepbang.lec15

import java.util.*

fun main() {
    var array = arrayOf(100, 200) // 100, 200이 들어가있는 배열

    for (i in array) {
        println(i)
    }

    for (i in array.indices) {
        println(array[i])
    }

    array.plus(300)

    for ((idx, value) in array.withIndex()) {
        println("$idx: $value")
    }
    val unmodifiableList = Collections.unmodifiableList(listOf(100, 200, 300))
    val emptyMap = emptyMap<String, Int>()

    val mutableList = mutableListOf(100, 200)

    mutableList.add(300)

    for (i in mutableList) {
        println(i)
    }

    val list = listOf(100, 200)
    list.plus(1) // 1을 추가하지만

    for (i in list) {
        println(i)
    }

}