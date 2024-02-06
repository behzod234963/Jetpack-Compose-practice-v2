package com.coder.behzod.jetpackcomposepracticev2.ui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.ProductModel

@Composable
fun ShoppingCartItem(model: ProductModel) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxHeight()
                .width(100.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(model.productImage),
                contentDescription = "shopping_cart_product_image"
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = model.productName,
                fontSize = 14.sp,
                fontWeight = FontWeight(500)
            )
            Text(
                text = model.productPrice.toString(),
                fontSize = 16.sp,
                fontWeight = FontWeight(700)
            )
            Text(
                text = "Удалить",
                fontSize = 12.sp,
                color = Color(0xFF878787),
                modifier = Modifier.clickable { }
            )
        }
    }
}
//
//@Preview
//@Composable
//fun PreviewShoppingCartItem() {
////    val product = ShoppingCartModel(
////        id = ProductID(1),
////        "самовывозь",
////        "30 000 UZS",
////        "0 UZS",
////        productPrice = ProductPrice("736 000 UZS"),
////        productImage = ProductsImage(R.drawable.pic_product_image),
////        productName = ProductName("asus")
////    )
//    ShoppingCartItem(product)
//}