package com.coder.behzod.jetpackcomposepracticev2.model

data class ProductModel(
    val id: Int,
    val productName: String,
    val productImage: Int,
    val productPrice: String,
    val productRating: Int,
    val isNew: Boolean = true,
    val commentsCount:Int
)
