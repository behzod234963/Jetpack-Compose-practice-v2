package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.coder.behzod.jetpackcomposepracticev2.ui.views.HomeScreenItem

@Composable
fun HomeScreen(navController:NavHostController) {
    LazyColumn (
        modifier = Modifier
            .wrapContentSize(unbounded = true)
    ){
        item {
            HomeScreenItem(navController = navController)
        }
    }
}