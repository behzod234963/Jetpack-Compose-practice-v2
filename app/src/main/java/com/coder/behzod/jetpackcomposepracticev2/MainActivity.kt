package com.coder.behzod.jetpackcomposepracticev2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.PaymentScreenWithBilling
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.ProductModel


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val products = ArrayList<ProductModel>()
        setContent {
            PaymentScreenWithBilling()
        }
    }
}