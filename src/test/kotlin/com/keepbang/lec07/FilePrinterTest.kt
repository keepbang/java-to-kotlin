package com.keepbang.lec07

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import java.io.FileNotFoundException
import java.io.IOException

class FilePrinterTest: StringSpec({
    "파일 Path를 받아서 값 반환 테스트" {
        FilePrinter().readFile("./a.txt") shouldBe "HELLO WORLD"
    }

    "존재하지 않는 파일 Path를 받을 경우 FileNotFoundException 발생" {
        shouldThrow<FileNotFoundException> {
            FilePrinter().readFile("./b.txt")
        }

    }
})
