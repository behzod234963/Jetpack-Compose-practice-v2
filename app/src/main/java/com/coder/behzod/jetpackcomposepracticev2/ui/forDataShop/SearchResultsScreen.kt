package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.toLowerCase
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.navArgument
import com.coder.behzod.jetpackcomposepracticev2.R
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.screens.Screens
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.viewModel.MainViewModel
import java.util.Locale

@Composable
fun SearchResultsScreen(navController: NavController?) {
    val viewModel = viewModel<MainViewModel>()
    val searchText by viewModel.searchText.collectAsState()
    val programmers by viewModel.programmers.collectAsState()
    val isSearching by viewModel.isSearching.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier
                    .size(56.dp)
                    .offset(y = 10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_back),
                    contentDescription = "back",
                    modifier = Modifier
                        .clickable {
                            navController?.navigate(Screens.SearchBar.route)
                        }
                )
            }
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
                OutlinedTextField(
                    value = searchText,
                    onValueChange = viewModel::searchTextChange,
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(1.dp,Color.Black, RoundedCornerShape(10.dp)),
                    shape = RoundedCornerShape(10.dp),
                    textStyle = TextStyle(
                        color = Color.Black,
                        fontSize = 15.sp
                    )
                )
            }
        }
        if (isSearching){
            Box(modifier = Modifier.fillMaxSize()){
                CircularProgressIndicator(
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }else{
            LazyColumn(
                modifier = Modifier.fillMaxWidth()
            ){
                items(programmers){programmers->
                    Text(
                        text = "${programmers.firstName} ${programmers.lastName}",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                            .clickable {  },
                        fontSize = 17.sp,
                        color = Color.Black
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewSearchBarResults() {
    SearchResultsScreen(navController = null)
}