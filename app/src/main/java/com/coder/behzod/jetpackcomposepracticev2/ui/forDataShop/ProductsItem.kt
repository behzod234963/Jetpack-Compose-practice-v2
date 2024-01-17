package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop

import android.icu.text.ListFormatter.Width
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coder.behzod.jetpackcomposepracticev2.R

@Preview
@Composable
fun ProductsItem() {
    Column(
        modifier = Modifier
            .width(168.dp)
            .height(250.dp)
            .padding(10.dp)
            .background(Color.White),
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(horizontal = 10.dp, vertical = 20.dp)
        ) {
            Image(
                alignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.50f),
                painter = painterResource(
                    id = R.drawable.ic_launcher_background),
                contentDescription = "image description",
                contentScale = ContentScale.Crop,
            )
            Text(
                text = "HP Victus 15 RTX 3050 / i5 12400f / 512 GB SSD..",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF000000)
                    ),
                modifier = Modifier.padding(top = 10.dp)
            )
            Row (
                modifier = Modifier
                    .padding(0.dp)
                    .fillMaxWidth()
                    .height(10.62286.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "image description",
                    contentScale = ContentScale.None
                )
            }
        }
    }
}
