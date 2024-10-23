package com.keepbang.lec10

class Derived2(
    override val number: Int
): Base(number) {
    init {
        println("Derived 2 number is $number")
    }
}