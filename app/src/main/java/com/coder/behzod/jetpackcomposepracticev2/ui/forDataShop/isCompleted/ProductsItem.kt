package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coder.behzod.jetpackcomposepracticev2.R
import com.coder.behzod.jetpackcomposepracticev2.ui.theme.BlackData
import com.coder.behzod.jetpackcomposepracticev2.ui.theme.GrayData

@Composable
fun ProductsItem() {
    Box(
        modifier = Modifier
            .shadow(
                elevation = 10.dp,
                spotColor = GrayData,
                ambientColor = GrayData
            )
            .clickable {  }
            .height(260.dp)
            .width(170.dp)
            .background(Color(0xFFFFFFFF))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(20.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .height(20.dp)
                        .width(40.dp)
                        .background(Color.Red),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "New",
                        fontSize = 10.sp,
                        fontWeight = FontWeight(700),
                        color = Color.White
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.End
                ) {
                    Image(
                        modifier = Modifier
                            .offset(x = (-12).dp, y = 12.dp)
                            .clickable { },
                        painter = painterResource(id = R.drawable.ic_favorite),
                        contentDescription = "favorite_button",
                        alignment = Alignment.CenterEnd
                    )
                }
            }
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(14.dp))
            Image(
                modifier = Modifier
                    .clickable {  }
                    .height(110.dp)
                    .width(90.dp),
                painter = painterResource(id = R.drawable.pic_product_image),
                contentDescription = "product_image",
            )
            Spacer(modifier = Modifier.height(14.dp))
            Text(
                modifier = Modifier
                    .clickable {  },
                text = "HP Victus 15 RTX 3050 / i5 12400f / 512 GB SSD..",
                fontSize = 12.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000)
            )
            Spacer(modifier = Modifier.height(6.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Image(
                    modifier = Modifier.
                    clickable {  },
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "ic_star",
                    contentScale = ContentScale.None
                )
                Image(
                    modifier = Modifier.
                    clickable {  },
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "ic_star",
                    contentScale = ContentScale.None
                )
                Image(
                    modifier = Modifier.
                    clickable {  },
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "ic_star",
                    contentScale = ContentScale.None
                )
                Image(
                    modifier = Modifier.
                    clickable {  },
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "ic_star",
                    contentScale = ContentScale.None
                )
                Image(
                    modifier = Modifier.
                    clickable {  },
                    painter = painterResource(id = R.drawable.ic_star),
                    contentDescription = "ic_star",
                    contentScale = ContentScale.None
                )
                Text(
                    modifier = Modifier
                        .padding(start = 5.dp)
                        .clickable {  },
                    text = "(31)",
                    fontSize = 10.sp,
                    fontWeight = FontWeight(400),
                    color = BlackData
                )
            }
            Spacer(modifier = Modifier.height(11.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    modifier = Modifier.
                    clickable {  },
                    text = "14.540.000 UZS",
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = BlackData,
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewProductsItem() {
    ProductsItem()
}