package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted

import java.text.DecimalFormat


fun String.numberSeparator(number: Long):String{
    val formatter = DecimalFormat("#,###")
    return formatter.format(number)
}
fun Long.moneyType(number:Long):String = this.toString().numberSeparator(number)+" so'm"
