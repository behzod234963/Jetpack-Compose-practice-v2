package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.coder.behzod.jetpackcomposepracticev2.R
import com.coder.behzod.jetpackcomposepracticev2.ui.views.AdsHorizontalPager
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.AdsModel
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.SearchBar
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.SetTopAppBar

@Composable
fun HomeScreen(navHostController: NavHostController) {
    val context = LocalContext.current
    val adsModel = AdsModel(
        1,
        "HP VICTUS",
        "15",
        null,
        "СОЗДАН ДЛЯ",
        "ПРОФЕССИОНАЛОВ",
        "ОТ ПРОФЕССИОНАЛОВ",
        R.drawable.pic_laptop
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
            .padding(10.dp)
    ) {
        SetTopAppBar(painterResource(id = R.drawable.ic_call))
        Spacer(modifier = Modifier.height(5.dp))
        SearchBar(navHostController)
        Spacer(modifier = Modifier.height(5.dp))
        AdsHorizontalPager(adsModel = adsModel)

    }
}

@Preview
@Composable
fun PreviewHomeScreen() {
    HomeScreen(navHostController = NavHostController(LocalContext.current))
}