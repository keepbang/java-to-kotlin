package com.keepbang.lec18

import com.lannstark.lec17.Fruit

fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000)
    )

    val applePrices = fruits.filter {fruit -> fruit.name == "사과"}
        .map { fruit -> fruit.price}
        .sortedDescending()
        .distinct()

    applePrices.forEach({
        println(it)
    })

    val map: Map<String, List<Fruit>> = fruits.groupBy { it.name }

    for (key in map.keys) {
        val list: List<Fruit>? = map[key]
        val str = list?.joinToString(separator = ",") { it.price.toString() } ?: ""

        println("$key -> $str")
    }
}