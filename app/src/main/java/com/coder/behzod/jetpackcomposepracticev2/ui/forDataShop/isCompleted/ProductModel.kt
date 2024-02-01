package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted

data class ProductModel(
    val id : Int,
    val productName:String,
    val productImage:Int,
    val productPrice:String,
    var productRating:Int? = 0,
    val comments:String?,
    var isFavorite:Boolean? = false,
    val isNew:Boolean?
)
