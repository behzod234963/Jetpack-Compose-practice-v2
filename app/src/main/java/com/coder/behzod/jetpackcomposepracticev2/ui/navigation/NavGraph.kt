package com.coder.behzod.jetpackcomposepracticev2.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.SearchBar
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.SearchResultsScreen
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.screens.Screens
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.SelectorView

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.SearchBar.route
        ){
//        navigate Search Results screen
        composable(
            route = Screens.SearchResults.route,
        ){
            SearchResultsScreen(navController = navController)
        }
//        navigate SearchBar view
        composable(
            route = Screens.SearchBar.route
        ){
            SearchBar(navController = navController)
        }
//        navigate Selector View
        composable(
            route = Screens.SelectorView.route
        ){
            SelectorView(navController = navController)
        }
    }
}
