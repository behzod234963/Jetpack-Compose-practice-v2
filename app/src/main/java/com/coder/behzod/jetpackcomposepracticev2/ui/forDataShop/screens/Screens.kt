package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.screens

import com.coder.behzod.jetpackcomposepracticev2.constants.SEARCH_RESULT_SCREEN_KEY

sealed class Screens(val route:String) {
    data object HomeScreen:Screens("home_screen")
    data object SearchBar:Screens("search_bar")
    data object SearchResults:Screens("search_result")
    data object SelectorView:Screens("selector_view")
}