package com.keepbang.lec10

class Derived(
    override val number: Int
): Base(number) {
    init {
        println("Derived number is $number")
    }
}