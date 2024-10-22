package com.keepbang.lec07

import io.kotest.assertions.throwables.shouldThrowWithMessage
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class Lec07MainKtTest: StringSpec ({

    "parseIntOrThrow에 문자가 입력될 경우 Exception 발생" {
        val inputStr = "a"
        shouldThrowWithMessage<IllegalArgumentException>(
            "주어진 ${inputStr}는 숫자가 아닙니다."
        ) {
            parseIntOrThrow(inputStr)
        }
    }

    "parseIntOrThrow에 문자가 입력될 경우 null return" {
        parseIntOrThrowV2("a") shouldBe null
    }

})