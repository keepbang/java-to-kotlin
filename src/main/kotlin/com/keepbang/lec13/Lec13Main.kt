package com.keepbang.lec13

fun main() {

}


class House(
    private val address: String,
    private val livingRoom: LivingRoom,
    private val people: List<People>
) {
    class LivingRoom(
        private val area: Double
    )

    inner class People(
        private val name: String
    ) {
        val address: String
            get() = this@House.address
    }
}