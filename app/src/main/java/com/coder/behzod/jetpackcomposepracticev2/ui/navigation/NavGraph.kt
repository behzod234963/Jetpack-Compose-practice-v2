package com.coder.behzod.jetpackcomposepracticev2.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.coder.behzod.jetpackcomposepracticev2.constants.SEARCH_RESULT_SCREEN_KEY
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.SearchBar
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.SearchResultsScreen
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.screens.Screens

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.SearchBar.route
        ){
        composable(
            route = Screens.SearchResults.route,
        ){
            SearchResultsScreen(navController = navController,null)
        }
        composable(
            route = Screens.SearchBar.route
        ){
            SearchBar(navController = navController)
        }
    }
}
