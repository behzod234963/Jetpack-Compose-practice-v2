package com.coder.behzod.jetpackcomposepracticev2.utils

fun moneyType(money: String): String {
    money
        .reversed()
        .chunked(3)
        .joinToString(" ")
        .reversed()
    return "$money UZS"
}