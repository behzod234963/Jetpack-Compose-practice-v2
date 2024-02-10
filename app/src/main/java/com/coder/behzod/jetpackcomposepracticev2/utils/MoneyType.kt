package com.coder.behzod.jetpackcomposepracticev2.utils

fun Long.moneyType():String{
    return this.toString().moneyType() + "so'm"
}

fun Int.moneyType():String{
    return this.toString().moneyType() + "so'm"
}

private fun String.moneyType(): String {
    return this
        .reversed()
        .chunked(3)
        .joinToString { " " }
        .reversed()
}
