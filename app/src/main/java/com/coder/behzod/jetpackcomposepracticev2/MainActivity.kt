package com.coder.behzod.jetpackcomposepracticev2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.Modifier
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.ProductModel
import com.coder.behzod.jetpackcomposepracticev2.ui.views.TotalCost


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val products = ArrayList<ProductModel>()
        setContent {
            TotalCost(
                model = ProductModel(
                    1,
                    "asus",
                    R.drawable.pic_product_image,
                    736000,
                    5,
                    "31",
                    false,
                    true,
                    30000,
                    "Курьером",
                    "0"
                ),
                Modifier
            )
        }
    }
}