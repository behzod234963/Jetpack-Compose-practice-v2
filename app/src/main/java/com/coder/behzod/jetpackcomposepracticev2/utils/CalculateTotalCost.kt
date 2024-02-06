package com.coder.behzod.jetpackcomposepracticev2.utils


fun calculateTotalCost(numFirst:String,numSecond:String): String {
    val result = numFirst.toInt() * numSecond.toInt()
    return moneyType(result.toString())
}