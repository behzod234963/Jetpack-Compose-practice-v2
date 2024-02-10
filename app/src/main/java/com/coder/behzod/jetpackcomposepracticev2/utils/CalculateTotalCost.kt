package com.coder.behzod.jetpackcomposepracticev2.utils


fun calculateTotalCost(price:Long, products:Long, other:Long ): String {
    val multiply = price * products
    val result = multiply.plus(other)
    return result.moneyType()
}