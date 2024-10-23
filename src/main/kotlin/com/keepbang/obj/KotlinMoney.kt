package com.keepbang.obj

import java.util.*

class KotlinMoney(val amount: Long) : Comparable<KotlinMoney> {
    operator fun plus(other: KotlinMoney): KotlinMoney {
        return KotlinMoney(this.amount + other.amount)
    }

    override fun compareTo(o: KotlinMoney): Int {
        return this.amount.compareTo(o.amount)
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val javaMoney = o as KotlinMoney?
        return amount == javaMoney?.amount
    }

    override fun hashCode(): Int {
        return Objects.hash(amount)
    }

    override fun toString(): String {
        return "JavaMoney{" +
                "amount=" + amount +
                '}'
    }
}