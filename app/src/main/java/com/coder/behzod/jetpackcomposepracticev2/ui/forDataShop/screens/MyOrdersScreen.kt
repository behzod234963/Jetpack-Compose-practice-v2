package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
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
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.SetTopAppBar

@Composable
fun MyOrdersScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
    ) {
        SetTopAppBar()
        Divider(
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .background(Color(0xFFD9D9D9))
        )
        Column(
            modifier = Modifier
                .padding(vertical = 10.dp, horizontal = 20.dp)
                .fillMaxWidth()
                .wrapContentHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 15.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier
                        .size(25.dp),
                    painter = painterResource(id = R.drawable.ic_person),
                    contentDescription = "personal_info"
                )
                Text(
                    modifier = Modifier
                        .padding(start = 20.dp),
                    text = "Персональные данные",
                    fontWeight = FontWeight(400),
                    fontSize = 16.sp,

                    )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 15.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        modifier = Modifier
                            .size(30.dp),
                        painter = painterResource(id = R.drawable.ic_delivery_1),
                        contentDescription = "delivery 1"
                    )
                    Image(
                        modifier = Modifier
                            .size(17.dp),
                        painter = painterResource(id = R.drawable.ic_delivery_2),
                        contentDescription = "delivery 2"
                    )
                    Image(
                        modifier = Modifier
                            .size(11.dp)
                            .offset(y = 8.8.dp, x = 9.dp),
                        painter = painterResource(id = R.drawable.ic_delivery_3),
                        contentDescription = "delivery 3"
                    )
                }
                Text(
                    modifier = Modifier
                        .padding(start = 20.dp),
                    text = "Мои заказы",
                    fontWeight = FontWeight(400),
                    fontSize = 16.sp,

                    )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 15.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier
                        .size(30.dp),
                    painter = painterResource(id = R.drawable.ic_notifications),
                    contentDescription = "personal_info"
                )
                Text(
                    modifier = Modifier
                        .padding(start = 20.dp),
                    text = "Уведомления",
                    fontWeight = FontWeight(400),
                    fontSize = 16.sp,

                    )
            }
        }
        Divider(
            modifier = Modifier
                .background(Color(0xFFD9D9D9))
        )
        Spacer(modifier = Modifier.height(10.dp))

    }
}

@Preview
@Composable
fun PreviewMyOrdersScreen() {
    MyOrdersScreen()
}