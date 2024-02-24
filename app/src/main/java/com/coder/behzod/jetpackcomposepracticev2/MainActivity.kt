package com.coder.behzod.jetpackcomposepracticev2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.navigation.NavController
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.ProductModel
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.screens.SelectorView


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
//            PaymentScreen(
//                model =  ProductModel(
//                    1,
//                    "asus",
//                    R.drawable.pic_product_image,
//                    1000000,
//                    0,
//                    "50",
//                    false,
//                    true,
//                    30000,
//                    "Pickup",
//                    ""
//                ),
//                products = products,
//                modifier = Modifier.verticalScroll(rememberScrollState())
//            )
            SelectorView(navController = NavController(this))
        }
    }
}