package com.keepbang.lec04

import com.lannstark.lec04.JavaMoney
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class Lec04MainKtTest {

    @Test fun `동일성 테스트(===)`() {
        val m1 = JavaMoney(1_000L)
        val m2 = m1
        val m3 = JavaMoney(1_000L)

        assertTrue(m1 === m2)
        assertFalse(m1 === m3)
    }

    @Test fun `동등성 테스트(==)`() {
        val m1 = JavaMoney(1_000L)
        val m2 = m1
        val m3 = JavaMoney(1_000L)

        assertTrue(m1 == m2)
        assertTrue(m1 == m3)
    }

}