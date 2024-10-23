package com.keepbang.lec09

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.inspectors.shouldForAll
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

class KotlinPersonTest: StringSpec ({

    "나이에 0아래 값이 들어갈 경우 Exception 발생" {
        listOf(0, -1)
            .shouldForAll {
                shouldThrow<IllegalArgumentException> {
                    KotlinPerson("name", it)
                }
            }
    }

    "어른인지 체크 테스트" {
        forAll(
            row(19, false),
            row(20, true)
        ) {
            age, result -> KotlinPerson("name", age).isAdult shouldBe result
        }

    }

})