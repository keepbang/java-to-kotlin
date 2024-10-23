package com.keepbang.lec11

import com.lannstark.lec12.StringUtils

/**
 * 접근 제어
 * 자바와 코틀린의 가시성 제어
 * 코틀린 파일의 접근 제어
 * 다양한 구성요소의 접근 제어
 * Java와 Kotlin을 함께 사용할 경우 주의할 점
 */
fun main() {
    val directoryPath = StringUtils.isDirectoryPath("directory/")
    println(directoryPath)
}
