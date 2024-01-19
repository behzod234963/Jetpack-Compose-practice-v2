package com.coder.behzod.jetpackcomposepracticev2.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.screens.SearchResultsScreen

@Composable
fun NavigateSearchResult() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "search_result"
    ){
        composable(
            "search_result"
        ){
            SearchResultsScreen(){
                navController.navigate("search_result")
            }
        }
    }
}