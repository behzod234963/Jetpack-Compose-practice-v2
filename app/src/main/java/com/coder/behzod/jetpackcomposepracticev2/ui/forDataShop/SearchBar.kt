package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.coder.behzod.jetpackcomposepracticev2.R
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.screens.Screens
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.viewModel.MainViewModel

@Composable
fun SearchBar(navController: NavController) {
    val viewModel = viewModel<MainViewModel>()
    val searchText by viewModel.searchText.collectAsState()
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
            .background(Color.White)
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
        ){
            Column(
                modifier = Modifier
                    .size(56.dp)
                    .padding(5.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Red),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_category),
                        contentDescription = "category"
                    )
                }
            }
            OutlinedTextField(
                value = searchText,
                onValueChange = viewModel::searchTextChange,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp, bottom = 5.dp, end = 5.dp)
                    .background(Color.White),
                placeholder = { Text(text = "Type Here...")}
            )
            Spacer(
                modifier = Modifier
                    .height(16.dp)
            )
            Column(
                modifier = Modifier
                    .background(Color.Red)
                    .size(56.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription ="search button",
                    modifier = Modifier
                        .clickable {
                            navController.navigate(route = Screens.SearchResults.route)
                        }
                )
            }
        }
    }
}

