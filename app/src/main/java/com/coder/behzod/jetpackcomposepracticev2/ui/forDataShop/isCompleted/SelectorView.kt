package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.coder.behzod.jetpackcomposepracticev2.R
import com.coder.behzod.jetpackcomposepracticev2.constants.CANCEL
import com.coder.behzod.jetpackcomposepracticev2.constants.DELIVERED
import com.coder.behzod.jetpackcomposepracticev2.constants.PROCESSING

@Composable
fun SelectorView(navController: NavController) {
    val isPersonalInfoSelected = remember {
        mutableStateOf(true)
    }
    val isMyOrdersSelected = remember {
        mutableStateOf(false)
    }
    val isNotificationSelected = remember {
        mutableStateOf(false)
    }
    val notificationList = ArrayList<NotificationModel>()
    val list = ArrayList<OrdersModel>()
    list.add(
        OrdersModel(
            1,
            "1050017AS",
            PROCESSING,
            "Oct 21,2021"
        )
    )
    list.add(
        OrdersModel(
            1,
            "1050017AS",
            DELIVERED,
            "Oct 21,2021"
        )
    )
    list.add(
        OrdersModel(
            1,
            "1050017AS",
            CANCEL,
            "Oct 21,2021"
        )
    )
    notificationList.add(
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
    notificationList.add(
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
    notificationList.add(
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
    notificationList.add(
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
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
    ) {
        SetTopAppBar(painterResource(id = R.drawable.ic_search))
        Divider(
            modifier = Modifier
                .padding(horizontal = 10.dp)
                .background(Color(0xFFD9D9D9))
        )
        Card(
            modifier = Modifier
                .padding(10.dp),
            colors = CardDefaults.cardColors(Color(0xFFFFFFFF)),
            shape = RoundedCornerShape(5.dp),
            elevation = CardDefaults.cardElevation(2.dp)
        ) {
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
                        .padding(vertical = 15.dp)
                        .clickable {
                            isPersonalInfoSelected.value = true
                            isMyOrdersSelected.value = false
                            isNotificationSelected.value = false
                        },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        modifier = Modifier
                            .size(25.dp),
                        painter = painterResource(id = R.drawable.ic_person),
                        tint =
                        if (isPersonalInfoSelected.value)
                            Color(0xFFE81D1C)
                        else
                            Color(0xFF3C3C3C),
                        contentDescription = "personal_info"
                    )
                    Text(
                        modifier = Modifier
                            .padding(start = 20.dp),
                        text = "Персональные данные",
                        fontWeight = FontWeight(400),
                        fontSize = 16.sp,
                        color =
                        if (isPersonalInfoSelected.value)
                            Color(0xFFE81D1C)
                        else
                            Color(0xFF3C3C3C),
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            isMyOrdersSelected.value = true
                            isPersonalInfoSelected.value = false
                            isNotificationSelected.value = false
                        }
                        .padding(vertical = 15.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            modifier = Modifier
                                .size(30.dp),
                            painter = painterResource(id = R.drawable.ic_delivery_1),
                            contentDescription = "delivery 1",
                            tint =
                            if (isMyOrdersSelected.value)
                                Color(0xFFE81D1C)
                            else
                                Color(0xFF3C3C3C),
                        )
                        Icon(
                            modifier = Modifier
                                .size(17.dp),
                            painter = painterResource(id = R.drawable.ic_delivery_2),
                            contentDescription = "delivery 2",
                            tint =
                            if (isMyOrdersSelected.value)
                                Color(0xFFE81D1C)
                            else
                                Color(0xFF3C3C3C),
                        )
                        Icon(
                            modifier = Modifier
                                .size(11.dp)
                                .offset(y = 8.8.dp, x = 9.dp),
                            painter = painterResource(id = R.drawable.ic_delivery_3),
                            contentDescription = "delivery 3",
                            tint =
                            if (isMyOrdersSelected.value)
                                Color(0xFFE81D1C)
                            else
                                Color(0xFF3C3C3C),
                        )
                    }
                    Text(
                        modifier = Modifier
                            .padding(start = 20.dp),
                        text = "Мои заказы",
                        fontWeight = FontWeight(400),
                        fontSize = 16.sp,
                        color =
                        if (isMyOrdersSelected.value)
                            Color(0xFFE81D1C)
                        else
                            Color(0xFF3C3C3C),
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            isNotificationSelected.value = true
                            isPersonalInfoSelected.value = false
                            isMyOrdersSelected.value = false
                        }
                        .padding(vertical = 15.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        modifier = Modifier
                            .size(30.dp),
                        painter = painterResource(id = R.drawable.ic_notifications),
                        contentDescription = "personal_info",
                        tint =
                        if (isNotificationSelected.value)
                            Color(0xFFE81D1C)
                        else
                            Color(0xFF3C3C3C),
                    )
                    Text(
                        modifier = Modifier
                            .padding(start = 20.dp),
                        text = "Уведомления",
                        fontWeight = FontWeight(400),
                        fontSize = 16.sp,
                        color =
                        if (isNotificationSelected.value)
                            Color(0xFFE81D1C)
                        else
                            Color(0xFF3C3C3C),
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        if (isMyOrdersSelected.value) {
            LazyColumn() {
                items(list) { item ->
                    OrdersItem(item)
                }
            }
        }
        if (isNotificationSelected.value) {
            if (notificationList.isEmpty()) {
                EmptyNotificationScreen()
            } else {
                LazyColumn(){
                    items(notificationList){items->
                        NotificationItem(notifModel = items)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewMyOrdersScreen() {
    SelectorView(NavController(LocalContext.current))
}