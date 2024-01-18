package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop

import android.icu.text.ListFormatter.Width
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.draw.shadow
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
    Box() {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .width(180.dp)
                .height(250.dp)
                .padding(5.dp)
                .background(Color.White)
                .shadow(
                    elevation = 10.dp,
                    spotColor = Color.Black
                )
        ) {
            Column(
                modifier = Modifier
                    .clickable { }
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(8.dp)
                    .background(Color.White),
                verticalArrangement = Arrangement.Center
            ) {
                Column(
                    modifier = Modifier
                        .clickable { }
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .padding(horizontal = 10.dp, vertical = 20.dp)
                ) {
                    Image(
                        alignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.50f)
                            .clickable { }
                            .padding(horizontal = 10.dp),
                        painter = painterResource(
                            id = R.drawable.ic_launcher_background
                        ),
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
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .clickable { }
                    )
                    Row(
                        modifier = Modifier
                            .padding(top = 3.dp)
                            .fillMaxWidth()
                            .height(20.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_star_filled),
                            contentDescription = "image description",
                            contentScale = ContentScale.None,
                            modifier = Modifier.clickable { }
                        )
                        Image(
                            painter = painterResource(id = R.drawable.ic_star_filled),
                            contentDescription = "image description",
                            contentScale = ContentScale.None,
                            modifier = Modifier.clickable { }
                        )
                        Image(
                            painter = painterResource(id = R.drawable.ic_star_filled),
                            contentDescription = "image description",
                            contentScale = ContentScale.None,
                            modifier = Modifier.clickable { }
                        )
                        Image(
                            painter = painterResource(id = R.drawable.ic_star_filled),
                            contentDescription = "image description",
                            contentScale = ContentScale.None,
                            modifier = Modifier.clickable { }
                        )
                        Image(
                            painter = painterResource(id = R.drawable.ic_star_filled),
                            contentDescription = "image description",
                            contentScale = ContentScale.None,
                            modifier = Modifier.clickable { }
                        )
                        Text(
                            text = ("(31)"),
                            color = Color.Black,
                            fontSize = 10.sp,
                            modifier = Modifier
                                .padding(start = 5.dp)
                                .clickable { }
                        )
                    }
                    Text(
                        text = "14.540.000 UZS",
                        fontSize = 15.sp,
                        fontWeight = FontWeight(600),
                        color = Color.Black,
                    )
                }
            }
        }
    }
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .padding(top = 5.dp, start = 10.dp)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Box(
            modifier = Modifier
                .width(41.dp)
                .height(18.68201.dp)
                .background(color = Color(0xFFE81D1C))
                .padding(bottom = 2.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "New",
                fontSize = 10.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth(0.40f)
                .padding(top = 10.dp),
            contentAlignment = Alignment.TopEnd
        ){
            Image(
                modifier = Modifier.clickable{},
                painter = painterResource(id = R.drawable.ic_favorite) ,
                contentDescription = "favorite",
            )
        }
    }
}
