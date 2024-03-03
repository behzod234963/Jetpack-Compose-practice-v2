package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coder.behzod.jetpackcomposepracticev2.R

@Composable
fun TotalCost(model: ProductModel,modifier:Modifier,products: ArrayList<ProductModel>) {
    val productsSize = products.size
    val productPrice: Long = model.productPrice
    val deliveryPrice: Long = model.deliveryPrice
    val productPromocode = model.productPromocode
    val result = calculateTotalCost(productPrice, productsSize, deliveryPrice)
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(15.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Итого: ",
                fontSize = 18.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF3C3C3C)
            )
            Text(
                text = result,
                fontSize = 18.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF3C3C3C)

            )
        }
        Spacer(modifier = Modifier.height(5.dp))
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Промокод:",
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF3C3C3C)
                )
                Text(
                    text = productPromocode,
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF888888)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Сумма доставки:",
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF3C3C3C)
                )
                Text(
                    text = deliveryPrice.moneyType(deliveryPrice),
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF888888)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Сумма товара:",
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF3C3C3C)
                )
                Text(
                    text = productPrice.moneyType(productPrice),
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF888888)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Divider(
                    thickness = 1.dp,
                    color = Color(0xFFD9D9D9)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Доставка:",
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF3C3C3C)
                )
                Text(
                    text = model.deliveryType,
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF888888)
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFE81D1C)
                    ),
                    shape = RectangleShape,
                    onClick = { /*TODO*/ }
                ) {
                    Text(
                        modifier = Modifier
                            .padding(vertical = 5.dp),
                        text = "Оформить заказ",
                        fontSize = 16.sp,
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF)
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            ) {
                Text(
                    text = "Нажимая 'Оформить заказ',я соглашаюсь с публичным договором оферты",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF888888)
                )
            }
        }
    }
}