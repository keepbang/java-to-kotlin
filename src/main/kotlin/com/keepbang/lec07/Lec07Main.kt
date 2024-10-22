package com.keepbang.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

/**
 * 예외 처리
 * 1. try catch finally 구문
 * 2. Checked, Unchecked Exception
 * 3. try with resources
 */

//try catch finally
fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt() // 명시적 형변환을 해야함
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}

// try catch도 Expression이기 때문에 바로 Return 가능하다.
fun parseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("종료")
    }
}

fun main() {
    val filePrinter = FilePrinter()
    filePrinter.readFile()
    val readFile = filePrinter.readFile("./a.txt")
    println(readFile)

}