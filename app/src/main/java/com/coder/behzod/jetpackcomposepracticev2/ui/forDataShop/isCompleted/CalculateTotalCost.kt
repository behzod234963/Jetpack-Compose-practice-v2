package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted


fun calculateTotalCost(price: Long, products: Int, delivery: Long) : String {
    val multiply = (price * products + delivery)
    return multiply.moneyType(multiply)
}