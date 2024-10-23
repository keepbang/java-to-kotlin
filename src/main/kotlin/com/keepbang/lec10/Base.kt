package com.keepbang.lec10

open class Base(
    open val number: Int = 100
) {
    init {
        println("Base Class")
        // 상위 클래스의 생성자가 먼저 실행 되기 때문에 하위 클래스에 오버라이드 하고 있는 프로퍼티를 사용하면 안된다.
        // 상위 클래스 생성자 또는 초기화 블록에서 open 프로퍼티를 사용하면 얘기치 못한 버그가 생길 수 있다.
        println(number)
    }
}