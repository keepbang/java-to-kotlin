package com.keepbang.lec14

enum class Country(
    val code: String
) {
    KOREA("KO"),
    AMERICA("US")
}

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> {}
        Country.AMERICA -> {}
    }
}