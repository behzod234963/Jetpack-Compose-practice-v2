package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted

data class AdsModel(
    val adsID:Int,
    val adsFirstProductName:String,
    val adsSecondProductName:String?,
    val adsThirdProductName:String?,
    val adsFirstDescription:String?,
    val adsSecondDescription:String?,
    val adsThirdDescription: String?,
    val adsImage:Int?
)
