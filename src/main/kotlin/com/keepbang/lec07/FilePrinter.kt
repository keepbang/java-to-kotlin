package com.keepbang.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt") // Checked, Unchecked 구분하지 않는다.
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    fun readFile(path: String): String {
        // try with resources 대신 use라는 Inline 함수를 사용
        // 내부적으로 close 함수를 실행함
        return BufferedReader(FileReader(path)).use(BufferedReader::readLine)
    }
}