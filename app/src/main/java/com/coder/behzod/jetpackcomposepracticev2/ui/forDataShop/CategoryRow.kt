package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coder.behzod.jetpackcomposepracticev2.R

@Preview
@Composable
fun CategoryRow() {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(Color.White),
        verticalAlignment = Alignment.CenterVertically
    ){
        Row (
            modifier = Modifier.fillMaxWidth(0.50f)
                .padding(10.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.ic_tv),
                contentDescription = "category tv"
            )
            Text(
                text = "Мониторы",
                modifier = Modifier.padding(top = 10.dp, start = 10.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )
        }
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Text(
                text = "Смотреть еще",
                modifier = Modifier
                    .padding(top = 8.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_view_more),
                contentDescription = "view more",
                modifier = Modifier.padding(top = 2.5.dp)
            )
        }
    }
}