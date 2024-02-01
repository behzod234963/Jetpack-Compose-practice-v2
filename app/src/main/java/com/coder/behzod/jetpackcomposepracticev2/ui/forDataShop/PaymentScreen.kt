package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop

import androidx.compose.foundation.background
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coder.behzod.jetpackcomposepracticev2.R
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.ProductModel
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.SetTopAppBar
import com.coder.behzod.jetpackcomposepracticev2.ui.views.ShoppingCartItem

@Composable
fun PaymentScreen() {
    val products = ArrayList<ProductModel>()
    products.add(
        ProductModel(
            1,
            "asus",
            R.drawable.pic_product_image,
            "6 800 000 UZS",
            null,
            null,
            null,
            null
        )
    )
    products.add(
        ProductModel(
            2,
            "asus",
            R.drawable.pic_product_image,
            "6 800 000 UZS",
            null,
            null,
            null,
            null
        )
    )
    products.add(
        ProductModel(
            3,
            "asus",
            R.drawable.pic_product_image,
            "6 800 000 UZS",
            null,
            null,
            null,
            null
        )
    )
    products.add(
        ProductModel(
            4,
            "asus",
            R.drawable.pic_product_image,
            "6 800 000 UZS",
            null,
            null,
            null,
            null
        )
    )
    products.add(
        ProductModel(
            5,
            "asus",
            R.drawable.pic_product_image,
            "6 800 000 UZS",
            null,
            null,
            null,
            null
        )
    )
    products.add(
        ProductModel(
            6,
            "asus",
            R.drawable.pic_product_image,
            "6 800 000 UZS",
            null,
            null,
            null,
            null
        )
    )
    products.add(
        ProductModel(
            7,
            "asus",
            R.drawable.pic_product_image,
            "6 800 000 UZS",
            null,
            null,
            null,
            null
        )
    )
    products.add(
        ProductModel(
            8,
            "asus",
            R.drawable.pic_product_image,
            "6 800 000 UZS",
            null,
            null,
            null,
            null
        )
    )
    products.add(
        ProductModel(
            9,
            "asus",
            R.drawable.pic_product_image,
            "6 800 000 UZS",
            null,
            null,
            null,
            null
        )
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {
            SetTopAppBar()
            Divider(
                modifier = Modifier
                    .offset(y = 10.dp)
                    .background(Color(0xFFD9D9D9))
            )
            Spacer(modifier = Modifier.height(25.dp))
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(
                    text = "Корзина",
                    fontSize = 20.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF3C3C3C)
                )
                Text(
                    text = "Товары в корзине (${products.size})",
                    fontSize = 16.sp,
                    fontWeight = FontWeight(400)
                )
            }
            Spacer(modifier = Modifier.height(25.dp))
            Divider(
                modifier = Modifier
                    .offset(y = (-10).dp)
                    .background(Color(0xFFD9D9D9))
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Детали продукта",
                color = Color(0xFF7D7D7D),
                fontWeight = FontWeight(400)
            )
            LazyColumn(
                modifier = Modifier
                    .height(300.dp)
                    .fillMaxWidth()
            ){
                itemsIndexed(products){_,items->
                    ShoppingCartItem(model = items)
                }
            }
            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}

@Preview
@Composable
fun PreviewPaymentScreen() {
    PaymentScreen()
}