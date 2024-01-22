package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop

import android.app.Application
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.isFinite
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.coder.behzod.jetpackcomposepracticev2.MainActivity
import com.coder.behzod.jetpackcomposepracticev2.R
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.screens.Screens
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.viewModel.MainViewModel

@Composable
fun SearchBar(navController: NavController?) {
    var text by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth()
                .offset(y = 10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier
                    .width(54.dp)
                    .height(52.dp)
                    .fillMaxSize()
                    .align(Alignment.CenterVertically)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 5.dp)
                        .clickable { }
                        .background(Color.Red),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_category),
                        contentDescription = "category",
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        navController?.navigate(Screens.SearchResults.route)
                    }
            ) {
                OutlinedTextField(
                    modifier = Modifier
                        .padding( end = 5.dp, start = 5.dp)
                        .background(Color.White)
                        .fillMaxWidth()
                        .clickable {
                            navController?.navigate(Screens.SearchResults.route)
                        }
                        .border(1.dp, color = Color.Black, shape = RoundedCornerShape(10.dp)),
                    shape = RoundedCornerShape(10.dp),
                    value = text,
                    enabled = false,
                    onValueChange = {
                        text = it
                    },
                    placeholder = { Text(text = "Type Here...", color = Color.Black) }
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewSearchBar() {
    SearchBar(navController = null)
}