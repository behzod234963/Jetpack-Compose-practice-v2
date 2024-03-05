package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.coder.behzod.jetpackcomposepracticev2.R
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.screens.Screens

@Composable
fun SearchBar(navController :NavHostController) {
    var text by remember { mutableStateOf("") }
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Color(0xFFFFFFFF))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(start = 5.dp)
                        .clickable { }
                        .background(Color(0xFFFF0000)),
                ) {
                    Icon(
                        modifier = Modifier
                            .padding(6.dp),
                        painter = painterResource(id = R.drawable.ic_category),
                        contentDescription = "category",
                        tint = Color(0xFFFFFFFF)
                    )
                }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate(Screens.SearchResults.route)
                    }
            ) {
                OutlinedTextField(
                    modifier = Modifier
                        .padding(end = 5.dp, start = 10.dp)
                        .background(Color(0xFFFFFFFF))
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate(Screens.SearchResults.route)
                        }
                        .border(1.dp, color = Color(0xFF000000), shape = RectangleShape),
                    shape = RoundedCornerShape(10.dp),
                    value = text,
                    enabled = false,
                    onValueChange = {
                        text = it
                    },
                    placeholder = {
                        Text(
                            text = "Введите запрос",
                            color = Color(0xFFB6B6B6)
                        )
                    }
                )
            }
        }
    }
}
@Preview
@Composable
fun PreviewSearchBar() {
    SearchBar(navController = NavHostController(LocalContext.current))
}