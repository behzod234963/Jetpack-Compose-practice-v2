package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Composable
fun EmptyFavoriteScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFFFFFF)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Нет Избранных",
                style = TextStyle(
                    color = Color(0xFF3C3C3C),
                    fontSize = 18.sp,
                    fontWeight = FontWeight(600)
                )
            )
        }
        SetTopAppBar()
    }
}

@Preview
@Composable
fun PreviewEmptyFavoriteScreen() {
    EmptyFavoriteScreen()
}