package com.coder.behzod.jetpackcomposepracticev2.ui.views

import android.inputmethodservice.Keyboard
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coder.behzod.jetpackcomposepracticev2.R
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.CategoryModel

@Composable
fun CategoryView(color: Color?,brush:Brush,model:CategoryModel) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(5.dp)
            .background(brush, shape = RoundedCornerShape(10))
    ) {
        Row (
            modifier = Modifier
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Text(
                text = model.categoryName.toString(),
                fontSize = 22.sp,
                fontWeight = FontWeight(700),
                color = Color(0xFFFFFFFF)
            )
            Image(
                painter = painterResource(model.categoryImage!!),
                contentDescription = null
            )
        }
    }
}