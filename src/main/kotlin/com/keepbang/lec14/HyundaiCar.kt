package com.keepbang.lec14

sealed class HyundaiCar(
    val name: String,
    val cost: Int
)

class Grandeur: HyundaiCar("그렌저", 3000)

class Sonata: HyundaiCar("소나타", 2000)

fun handleCar(car: HyundaiCar): String {
    return when (car) {
        is Avante -> car.toString()
        is Grandeur -> car.toString()
        is Sonata -> car.toString()
    }
}

fun main() {
    println(handleCar(Avante("A")))
}