package com.coder.behzod.jetpackcomposepracticev2.ui.views

import android.icu.number.Scale
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.coder.behzod.jetpackcomposepracticev2.R
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.BrandsModel
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.CategoryModel

@Composable
fun BrandsItem(model: BrandsModel) {
    Card (
        modifier = Modifier
            .width(130.dp)
            .height(80.dp)
            .padding(10.dp),
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFFFFFF)
        )
    ){
        Row (
            modifier = Modifier
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                modifier = Modifier.padding(15.dp),
                painter = painterResource(id = model.brandsImage!!),
                contentDescription = null,
                contentScale = ContentScale.Inside
            )
        }
    }
}

@Preview
@Composable
private fun BrandsItemsPrev() {
    BrandsItem(model = BrandsModel(1, ",", R.drawable.ic_brands))
}