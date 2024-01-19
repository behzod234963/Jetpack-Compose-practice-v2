package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.screens.Screens
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.viewModel.MainViewModel

@Composable
fun SearchResultsScreen() {
    val viewModel = viewModel<MainViewModel>()
    val searchText by viewModel.searchText.collectAsState()
    val programmers by viewModel.programmers.collectAsState()
    val isSearching by viewModel.isSearching.collectAsState()

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