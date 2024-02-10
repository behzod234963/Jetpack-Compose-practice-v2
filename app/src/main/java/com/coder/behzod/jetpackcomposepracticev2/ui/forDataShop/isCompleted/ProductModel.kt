package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted

data class ProductModel(
    val id : Int,
    val productName:String,
    val productImage:Int,
    val productPrice:Long,
    var productRating:Int = 0,
    val comments:String,
    var isFavorite:Boolean = false,
    val isNew:Boolean,
    val deliveryPrice:Long,
    val deliveryType:String,
    val productPromocode:String
)
