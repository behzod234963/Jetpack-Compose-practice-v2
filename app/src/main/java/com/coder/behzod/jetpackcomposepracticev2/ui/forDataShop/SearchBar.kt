package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.viewModel.MainViewModel

@Composable
@Preview
fun SearchBar() {
    val viewModel = viewModel<MainViewModel>()
    val searchText by viewModel.searchText.collectAsState()
    val programmers by viewModel.programmers.collectAsState()
    val isSearching by viewModel.isSearching.collectAsState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White)
    ) {
        TextField(
            value = searchText,
            onValueChange = viewModel::searchTextChange,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            placeholder = { Text(text = "Type Here...")}
        )
        Spacer(
            modifier = Modifier
                .height(16.dp)
        )
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
                    )
                }
            }
        }
    }
}