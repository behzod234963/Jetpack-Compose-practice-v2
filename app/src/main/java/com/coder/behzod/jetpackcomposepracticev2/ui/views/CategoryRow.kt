package com.coder.behzod.jetpackcomposepracticev2.ui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coder.behzod.jetpackcomposepracticev2.R

@Composable
fun CategoryRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(Color.White),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(0.50f)
                .padding(start = 10.dp)
                .clickable {  },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_tv),
                contentDescription = "category tv",
                modifier = Modifier
                    .clickable {  }
            )
            Text(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .clickable {  },
                text = "Мониторы",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 10.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Смотреть еще",
                modifier = Modifier
                    .clickable { }
                    .offset(x = -10.dp),
            )
            Image(
                painter = painterResource(id = R.drawable.ic_view_more),
                contentDescription = "view more",
                modifier = Modifier
                    .offset(y = 2.dp)
                    .clickable { }
            )
        }
    }
}

@Preview
@Composable
fun PreviewCategoryRow() {
    CategoryRow()
}