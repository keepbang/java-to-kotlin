package com.keepbang.lec12

import com.keepbang.lec10.Animal
import com.lannstark.lec12.Movable

fun main() {
    Person.newBaby("aaa")
    println(SingletonComponent.a)
    println(SingletonComponent.a + 10)
    moveSomething(object: Movable {
        override fun move() {
            TODO("Not yet implemented")
        }

        override fun fly() {
            TODO("Not yet implemented")
        }

    })
}

class Person private constructor(
    var name: String,
    var age: Int
) {
    companion object: Log, Animal("강아지", 1) {
        const val MIN_AGE = 1
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun print() {
            TODO("Not yet implemented")
        }

        override fun move() {
            TODO("Not yet implemented")
        }

        override fun sound() {
            TODO("Not yet implemented")
        }
    }
}

object SingletonComponent {
    var a:Int = 0
}

fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}