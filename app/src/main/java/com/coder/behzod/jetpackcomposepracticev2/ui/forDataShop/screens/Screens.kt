package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.screens

sealed class Screens(val route:String) {
    data object SearchBar:Screens("search_bar")
    data object SearchResults:Screens("search_result")
}