package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coder.behzod.jetpackcomposepracticev2.constants.DELIVERED
import com.coder.behzod.jetpackcomposepracticev2.constants.PROCESSING

@Composable
fun OrdersItem(ordersModel: OrdersModel) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .height(60.dp)
            .clickable {  }
            .background(Color(0xFFFFFFFF)),
        colors = CardDefaults.cardColors(Color(0xFFFFFFFF)),
        shape = RoundedCornerShape(5.dp),
        elevation = CardDefaults.cardElevation(1.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
                .clickable {  }
                .background(Color(0xFFFFFFFF)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                modifier = Modifier
                    .clickable {  },
                text = ordersModel.orderCode,
                fontSize = 18.sp,
                fontWeight = FontWeight(700)
            )
            Card(
                modifier = Modifier
                    .wrapContentHeight()
                    .wrapContentWidth()
                    .clickable {  },
                colors = CardDefaults
                    .cardColors(
                        if (ordersModel.orderStatus.contains(PROCESSING)){
                            Color(0xFFF3F6F9)
                        }else if (ordersModel.orderStatus.contains(DELIVERED)){
                            Color(0xFFE7F9ED)
                        }else{
                            Color(0xFFFCE9EC)
                        }
                    ),
                shape = RoundedCornerShape(30.dp)
            ) {
                Row(
                    modifier = Modifier
                        .wrapContentWidth()
                        .wrapContentHeight()
                        .padding(vertical = 10.dp, horizontal = 5.dp)
                        .clickable {  },
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        modifier = Modifier
                            .clickable {  },
                        text = ordersModel.orderStatus,
                        fontSize = 15.sp,
                        fontWeight = FontWeight(500),
                        color =
                        if (ordersModel.orderStatus.contains(PROCESSING)){
                            Color(0xFF0F3460)
                        }else if (ordersModel.orderStatus.contains(DELIVERED)){
                            Color(0xFF33D067)
                        }else{
                            Color(0xFFE81D1C)
                        }
                    )
                }
            }
            Text(
                text = ordersModel.orderDate,
                modifier = Modifier
                    .clickable {  }
            )
            IconButton(
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = null,
                    tint = Color(0xFF7D879C)
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewOrdersItem() {
    OrdersItem(
        OrdersModel(
            1,
            "1050017AS",
            "Доставлено",
            "Oct 21,2021"
        )
    )
}