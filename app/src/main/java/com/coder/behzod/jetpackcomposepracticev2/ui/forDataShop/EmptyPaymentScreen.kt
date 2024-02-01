package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.SetTopAppBar

@Composable
fun EmptyPaymentScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White) ){
        Column {
            SetTopAppBar()
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
            ){
                Text(
                    text = "Корзина пуста",
                    color = Color(0xFF3C3C3C),
                    fontWeight = FontWeight(600),
                    fontSize = 22.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewEmptyPaymentScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        EmptyPaymentScreen()
    }
}