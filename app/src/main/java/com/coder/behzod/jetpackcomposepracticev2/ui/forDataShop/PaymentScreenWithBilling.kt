package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop

import android.annotation.SuppressLint
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coder.behzod.jetpackcomposepracticev2.R
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.SetTopAppBar

@SuppressLint("InvalidColorHexValue")
@Composable
fun PaymentScreenWithBilling() {
    var fullAddress = remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        SetTopAppBar()
        Column(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxSize()
        ) {
            Divider(
                modifier = Modifier
                    .offset(y = 10.dp)
                    .background(Color(0xFFD9D9D9))
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "1.Как вы хотите получить заказ?",
                fontWeight = FontWeight(400),
                fontSize = 16.sp,
                color = Color(0xFF3C3C3C)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Button(
                    modifier = Modifier
                        .height(40.dp)
                        .padding(end = 10.dp)
                        .border(width = 1.dp, color = Color(0xFFBCBCBC))
                        .fillMaxWidth(0.50f),
                    colors = ButtonDefaults.buttonColors(Color.White),
                    shape = RectangleShape,
                    onClick = { /*TODO*/ }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Image(
                            modifier = Modifier
                                .size(20.dp),
                            painter = painterResource(id = R.drawable.ic_pickup),
                            contentDescription = "pickup"
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "Самовывоз",
                            fontSize = 15.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xFF3C3C3C)
                        )
                    }
                }
                Button(
                    modifier = Modifier
                        .height(40.dp)
                        .padding(start = 10.dp)
                        .border(width = 1.dp, color = Color(0xFFBCBCBC))
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Color.White),
                    shape = RectangleShape,
                    onClick = { /*TODO*/ }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Box(
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                modifier = Modifier
                                    .size(20.dp),
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
                                    .size(9.dp)
                                    .offset(y = 5.dp, x = 5.dp),
                                painter = painterResource(id = R.drawable.ic_delivery_3),
                                contentDescription = "delivery 3"
                            )
                        }
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(
                            text = "Доставка",
                            fontSize = 14.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xFF3C3C3C)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "2.Укажите адрес доставки",
                fontWeight = FontWeight(600),
                fontSize = 16.sp,
                color = Color(0xFF3C3C3C)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth(0.50f)
                            .height(70.dp)
                            .padding(end = 10.dp)
                    ) {
                        Text(
                            text = "Область",
                            fontWeight = FontWeight(500),
                            fontSize = 14.sp,
                            color = Color(
                                0xFF636363
                            )
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        DropDownMenuItem(
                            modifier = Modifier
                                .height(70.dp)
                                .fillMaxWidth(),
                            list = mutableListOf(
                                "Выберите область"
                            )
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(70.dp)
                            .padding(start = 10.dp)
                    ) {
                        Text(
                            text = "Город",
                            fontWeight = FontWeight(500),
                            fontSize = 14.sp,
                            color = Color(
                                0xFF636363
                            )
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        DropDownMenuItem(
                            modifier = Modifier
                                .height(70.dp)
                                .fillMaxWidth(),
                            list = mutableListOf(
                                "Выберите город"
                            )
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Польный адрес",
                        fontWeight = FontWeight(500),
                        fontSize = 14.sp,
                        color = Color(
                            0xFF636363
                        )
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    OutlinedTextField(
                        modifier = Modifier
                            .fillMaxWidth()
                            .border(
                                shape = RoundedCornerShape(3.dp),
                                color = Color(0xFFBCBCBC),
                                width = 1.dp
                            ),
                        value = fullAddress.value,
                        colors = TextFieldDefaults.colors(
                            focusedContainerColor = Color.White,
                            unfocusedContainerColor = Color.White
                        ),
                        onValueChange = {
                            fullAddress.value = it
                        },
                        placeholder = {
                            Text(
                                text = "Введите польный адрес",
                                fontWeight = FontWeight(500),
                                fontSize = 12.sp,
                                color = Color(0xFF636363)
                            )
                        }
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                Text(
                    text = "3.Выберите способ оплаты",
                    fontWeight = FontWeight(600),
                    fontSize = 16.sp,
                    color = Color(
                        0xFF3C3C3C
                    )
                )
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Button(
                        modifier = Modifier
                            .fillMaxWidth(0.50f)
                            .height(50.dp)
                            .padding(end = 10.dp)
                            .border(width = 1.dp, color = Color(0xFFBCBCBC)),
                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RectangleShape,
                        onClick = { /*TODO*/ }
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                        ) {
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center
                            ){
                                Image(
                                    modifier = Modifier
                                        .size(height = 34.dp, width = 85.dp),
                                    painter = painterResource(id = R.drawable.ic_click_pay),
                                    contentDescription = "click"
                                )
                            }
                        }
                    }
                    Button(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .padding(start = 10.dp)
                            .border(width = 1.dp, color = Color(0xFFBCBCBC)),
                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RectangleShape,
                        onClick = { /*TODO*/ }
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                        ) {
                            Row (
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.Center
                            ){
                                Image(
                                    modifier = Modifier
                                        .size(height = 32.dp, width = 82.dp),
                                    painter = painterResource(id = R.drawable.ic_payme_pay),
                                    contentDescription = "payme"
                                )
                            }
                        }
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Button(
                        modifier = Modifier
                            .height(40.dp)
                            .padding(end = 10.dp)
                            .border(width = 1.dp, color = Color(0xFFBCBCBC))
                            .fillMaxWidth(0.50f),
                        colors = ButtonDefaults.buttonColors(Color.White),
                        shape = RectangleShape,
                        onClick = { /*TODO*/ }
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxSize(),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Image(
                                modifier = Modifier
                                    .size(20.dp),
                                painter = painterResource(id = R.drawable.ic_pickup),
                                contentDescription = "pickup"
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                text = "Самовывоз",
                                fontSize = 15.sp,
                                fontWeight = FontWeight(500),
                                color = Color(0xFF3C3C3C)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewPaymentScreenWithBilling() {
    PaymentScreenWithBilling()
}