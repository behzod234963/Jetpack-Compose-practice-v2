package com.coder.behzod.jetpackcomposepracticev2.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.coder.behzod.jetpackcomposepracticev2.constants.SEARCH_RESULT_SCREEN_KEY
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.SearchResultsScreen
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.screens.Screens

@Composable
fun NavGraph(
    navController:NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screens.SearchBar.route
        ){
        composable(
            route = Screens.SearchResults.route,
            arguments = listOf(
                navArgument(
                    SEARCH_RESULT_SCREEN_KEY,){
                    type = NavType.StringType
                }
            )
        ){
            SearchResultsScreen(navController = navController)
        }
        composable(
            route = Screens.SearchBar.route
        ){

        }
    }
}
