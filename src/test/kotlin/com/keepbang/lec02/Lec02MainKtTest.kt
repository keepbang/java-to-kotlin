package com.keepbang.lec02

import com.lannstark.lec02.Lec02Main
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Lec02MainKtTest {

    @Test fun `startsWithA1 null 입력 테스트`() {
        //given
        val lec02Main = Lec02Main()

        // when
        // then
        val assertThrows = assertThrows(IllegalArgumentException::class.java) {
            lec02Main.startsWithA1(null)
        }
        assertEquals(assertThrows.message, "null이 들어왔습니다")
    }

    @Test fun `startsWithA2 null 입력 테스트`() {
        //given
        val lec02Main = Lec02Main()

        // when
        val result = lec02Main.startsWithA2(null)
        // then
        assertEquals(result, null)

    }

    @Test fun `startsWithA3 null 입력 테스트`() {
        //given
        val lec02Main = Lec02Main()

        // when
        val result = lec02Main.startsWithA3(null)
        // then
        assertFalse(result)
    }
}