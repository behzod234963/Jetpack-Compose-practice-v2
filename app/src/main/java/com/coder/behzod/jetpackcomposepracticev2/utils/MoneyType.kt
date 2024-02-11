package com.coder.behzod.jetpackcomposepracticev2.utils

import java.text.DecimalFormat


fun String.numberSeparator(number: Long):String{
    val formatter = DecimalFormat("#,###")
    return formatter.format(number)
}

val currency = "so'm"
fun Long.moneyType(number:Long):String = this.toString().numberSeparator(number)+" so'm"
