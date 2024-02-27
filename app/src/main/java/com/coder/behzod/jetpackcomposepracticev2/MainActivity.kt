package com.coder.behzod.jetpackcomposepracticev2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.navigation.NavController
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.ExampleHorizontalPager
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.AdsModel
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.ProductModel
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.SelectorView


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val adsList = ArrayList<AdsModel>()
        adsList.add(
            AdsModel(
                1,
                "HP VICTUS",
                "15",
                null,
                "СОЗДАН ДЛЯ",
                "ПРОФЕССИОНАЛОВ",
                "ОТ ПРОФЕССИОНАЛОВ",
                R.drawable.pic_laptop
            )
        )
        setContent {
            ExampleHorizontalPager(
                AdsModel(
                    1,
                    "HP VICTUS",
                    "15",
                    null,
                    "СОЗДАН ДЛЯ",
                    "ПРОФЕССИОНАЛОВ",
                    "ОТ ПРОФЕССИОНАЛОВ",
                    R.drawable.pic_laptop
                )
            )
        }
    }
}