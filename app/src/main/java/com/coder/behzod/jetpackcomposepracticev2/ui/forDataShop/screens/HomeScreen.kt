package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.coder.behzod.jetpackcomposepracticev2.R
import com.coder.behzod.jetpackcomposepracticev2.constants.ADS_MODEL
import com.coder.behzod.jetpackcomposepracticev2.constants.CATEGORY_MODEL
import com.coder.behzod.jetpackcomposepracticev2.constants.CATEGORY_OBJECT
import com.coder.behzod.jetpackcomposepracticev2.constants.LAPTOPS
import com.coder.behzod.jetpackcomposepracticev2.constants.PRODUCT_MODEL
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.CategoryModel
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.ProductModel
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.ProductsItem
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.SearchBar
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.SetTopAppBar
import com.coder.behzod.jetpackcomposepracticev2.ui.views.AdsHorizontalPager
import com.coder.behzod.jetpackcomposepracticev2.ui.views.CategoryRow
import com.coder.behzod.jetpackcomposepracticev2.ui.views.CategoryView

@Composable
fun HomeScreen(navController: NavHostController) {
    val productList = ArrayList<ProductModel>()
    productList.add(PRODUCT_MODEL)
    productList.add(PRODUCT_MODEL)
    Column(
        modifier = Modifier
            .fillMaxSize()
    ){
        SetTopAppBar(painter = painterResource(id = R.drawable.ic_call))
        Spacer(modifier = Modifier.height(5.dp))
        SearchBar(navController)
        Spacer(modifier = Modifier.height(10.dp))
        LazyVerticalGrid(
            modifier = Modifier
                .fillMaxSize(),
            columns = GridCells.Fixed(2)
        ) {
            item (span = { GridItemSpan(2) }){
                Column (
                    modifier = Modifier
                        .padding(10.dp)
                ){
                    AdsHorizontalPager(adsModel = ADS_MODEL)
                    Spacer(modifier = Modifier.height(10.dp))
                    CategoryView(
                        Color(0xFF60B2FF),
                        CategoryModel(null, LAPTOPS,R.drawable.pic_laptop_front,null)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    CategoryRow(CATEGORY_MODEL)
                    Spacer(modifier = Modifier.height(10.dp))
                }
            }
            items(productList,span = { GridItemSpan(1) }) {
                ProductsItem(product = it)
            }
            item (span = { GridItemSpan(2) }){
                Spacer(modifier = Modifier.height(20.dp))
                CategoryView(
                    Color(),
                    CategoryModel(null, LAPTOPS,R.drawable.pic_laptop_front,null)
                )
                Spacer(modifier = Modifier.height(10.dp))
                CategoryRow(CATEGORY_MODEL)
            }
        }
    }
}

@Preview
@Composable
private fun PreviewHS() {
    val context = LocalContext.current
    HomeScreen(navController = NavHostController(context))
}