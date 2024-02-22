package com.coder.behzod.jetpackcomposepracticev2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.CartScreen
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.PaymentScreen
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.ProductModel


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val products = ArrayList<ProductModel>()
        products.add(
            ProductModel(
                1,
                "asus",
                R.drawable.pic_product_image,
                300000,
                0,
                "50",
                false,
                true,
                30000,
                "Pickup",
                ""
            )
        )
        products.add(
            ProductModel(
                1,
                "asus",
                R.drawable.pic_product_image,
                300000,
                0,
                "50",
                false,
                true,
                30000,
                "Pickup",
                ""
            )
        )
        products.add(
            ProductModel(
                1,
                "asus",
                R.drawable.pic_product_image,
                300000,
                0,
                "50",
                false,
                true,
                30000,
                "Pickup",
                ""
            )
        )
        products.add(
            ProductModel(
                1,
                "asus",
                R.drawable.pic_product_image,
                300000,
                0,
                "50",
                false,
                true,
                30000,
                "Pickup",
                ""
            )
        )
        setContent {
            PaymentScreen(
                model =  ProductModel(
                    1,
                    "asus",
                    R.drawable.pic_product_image,
                    1000000,
                    0,
                    "50",
                    false,
                    true,
                    30000,
                    "Pickup",
                    ""
                ),
                products = products,
                modifier = Modifier.verticalScroll(rememberScrollState())
            )
        }
    }
}