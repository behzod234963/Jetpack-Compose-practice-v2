package com.coder.behzod.jetpackcomposepracticev2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.Modifier
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.PaymentScreen
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.ProductModel
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.ProductsItem


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val products = ArrayList<ProductModel>()



        val list = ArrayList<ProductModel>()
        list.add(
            ProductModel(
                1,
                "asus",
                R.drawable.pic_product_image,
                "5",
                2,
                "dsvdgrf",
                false,
                false

            )
        )
        list.add(
            ProductModel(
                1,
                "asus",
                R.drawable.pic_product_image,
                "5",
                1,
                "dsvdgrf",
                false,
                true
            )
        )
        list.add(
            ProductModel(
                1,
                "asus",
                R.drawable.pic_product_image,
                "5",
                3,
                "dsvdgrf",
                false,
                true
            )
        )
        list.add(
            ProductModel(
                1,
                "asus",
                R.drawable.pic_product_image,
                "5",
                5,
                "dsvdgrf",
                false,
                true
            )
        )
        list.add(
            ProductModel(
                1,
                "afbnknbn",
                R.drawable.pic_product_image,
                "5",
                5,
                "fbnhklbtgr",
                false,
                true
            )
        )

        setContent {
            PaymentScreen()
        }
    }
}