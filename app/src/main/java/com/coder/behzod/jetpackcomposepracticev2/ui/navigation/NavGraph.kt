package com.coder.behzod.jetpackcomposepracticev2.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.SearchBar
import androidx.navigation.compose.rememberNavController
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.SearchResultsScreen
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.screens.Screens
import com.coder.behzod.jetpackcomposepracticev2.ui.forMe.SearchBar

@Composable
fun NavGraph(
    navController:NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screens.SearchBar.route
        ){
        composable(
            route = Screens.SearchResults.route
        ){
            SearchResultsScreen()
        }
        composable(
            route = Screens.SearchBar.route
        ){
            SearchBar(navController = navController)
        }
    }
}
