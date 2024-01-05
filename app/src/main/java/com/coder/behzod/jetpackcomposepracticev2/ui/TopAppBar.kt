package com.coder.behzod.jetpackcomposepracticev2.ui

import androidx.compose.foundation.background
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.coder.behzod.jetpackcomposepracticev2.R

@Composable
fun HomeScreen() {

}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun SetTopAppBar(){
    TopAppBar(title = {
        Text(text = "AppBar",
            color = Color.Red,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Normal
        )
    },
        Modifier.background(Color.Gray),
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(painterResource(id = R.drawable.ic_launcher_background),contentDescription = "menu")
            }
        }, actions = {
            Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "mic")
        }
    )
}