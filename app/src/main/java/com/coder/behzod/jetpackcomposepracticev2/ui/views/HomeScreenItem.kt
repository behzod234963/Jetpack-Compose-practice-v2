package com.coder.behzod.jetpackcomposepracticev2.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.coder.behzod.jetpackcomposepracticev2.R
import com.coder.behzod.jetpackcomposepracticev2.constants.ADS_MODEL
import com.coder.behzod.jetpackcomposepracticev2.constants.CATEGORY_MODEL
import com.coder.behzod.jetpackcomposepracticev2.constants.PRODUCT_MODEL
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.ProductModel
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.ProductsItem
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.SearchBar
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.SetTopAppBar

@Composable
fun HomeScreenItem(navController: NavHostController) {
    val productsList = ArrayList<ProductModel>()
    productsList.add(
        PRODUCT_MODEL
    )
    productsList.add(
        PRODUCT_MODEL
    )
    productsList.add(
        PRODUCT_MODEL
    )
    productsList.add(
        PRODUCT_MODEL
    )
    productsList.add(
        PRODUCT_MODEL
    )
    productsList.add(
        PRODUCT_MODEL
    )
    productsList.add(
        PRODUCT_MODEL
    )
    Column(
        modifier = Modifier
            .wrapContentSize(unbounded = true)
            .background(Color(0xFFFFFFFF))
            .padding(10.dp)
    ) {
        SetTopAppBar(painterResource(id = R.drawable.ic_call))
        Spacer(modifier = Modifier.height(5.dp))
        SearchBar(navController)
        Spacer(modifier = Modifier.height(10.dp))
        AdsHorizontalPager(adsModel = ADS_MODEL)
        Spacer(modifier = Modifier.height(10.dp))
        CategoryView()
        Spacer(modifier = Modifier.height(10.dp))
        CategoryRow(CATEGORY_MODEL)
        Spacer(modifier = Modifier.height(10.dp))
        LazyVerticalGrid(
            columns = GridCells.Fixed(2)
        ) {
            items(productsList) { items ->
                ProductsItem(product = items)
            }
        }
    }
}
