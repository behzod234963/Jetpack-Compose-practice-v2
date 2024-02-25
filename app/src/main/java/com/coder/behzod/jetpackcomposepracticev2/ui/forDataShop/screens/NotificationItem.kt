package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
fun NotificationItem(notifModel: NotificationModel) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(15.dp)
    ) {

        Card(
            modifier = Modifier
                .clickable {  },
            colors = CardDefaults.cardColors(Color(0xFFFFFFFF)),
            shape = RoundedCornerShape(5.dp),
            elevation = CardDefaults.cardElevation(2.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(10.dp)
            ) {
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    modifier = Modifier
                        .clickable {  },
                    text = notifModel.notifData,
                    color = Color(0xFFB0B0B0),
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    modifier = Modifier
                        .clickable {  },
                    text = notifModel.notifTitle,
                    fontSize = 18.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF3C3C3C)
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    modifier = Modifier
                        .clickable {  },
                    text = notifModel.notifContent,
                    fontSize = 12.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF737373)
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (-20).dp,x = 20.dp),
            contentAlignment = Alignment.TopEnd
        ){
            IconButton(
                modifier = Modifier
                    .padding(end = 10.dp),
                onClick = { },
            ) {
                Icon(
                    modifier = Modifier,
                    painter = painterResource(id = R.drawable.ic_cancel),
                    contentDescription = null,
                    tint = Color(0xFFE81D1C)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewNotificationItem() {
    NotificationItem(
        NotificationModel(
            1,
            "26-10-2022",
            "С новым 2023 годом",
            "Lorem Ipsum is simply dummy text " +
                    "of the printing and typesetting industry. " +
                    "Lorem Ipsum has been the industry's standard dummy text " +
                    "ever since the 1500s"
        )
    )
}