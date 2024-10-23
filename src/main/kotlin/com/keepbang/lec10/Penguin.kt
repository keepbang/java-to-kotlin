package com.keepbang.lec10

class Penguin(
    species: String,
    wingCount: Int
): Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    // 프로퍼티에 오버라이드를 할때에는 open키워드를 붙여야 오버라이드 할 수 있다.
    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun move() {
        println("펭귄이 뒤뚱뒤뚱 움직입니다.")
    }

    override fun sound() {
        println("꿱!꿱!")
    }

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

}