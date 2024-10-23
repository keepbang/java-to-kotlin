package com.keepbang.lec10

// 추상 프로퍼티가 아니라면 open을 꼭 붙여야 한다.
abstract class Animal(
    protected val species: String,
    protected open val legCount: Int
) {
    abstract fun move()
    abstract fun sound()
}