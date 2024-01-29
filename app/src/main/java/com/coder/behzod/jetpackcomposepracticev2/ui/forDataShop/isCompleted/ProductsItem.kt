package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted

import android.widget.ImageButton
import android.widget.ToggleButton
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
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.coder.behzod.jetpackcomposepracticev2.R
import com.coder.behzod.jetpackcomposepracticev2.ui.theme.BlackData
import com.coder.behzod.jetpackcomposepracticev2.ui.theme.GrayData

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun ProductsItem(product: ProductModel) {
    var productRating by remember { mutableStateOf(product.productRating) }
    var productState by remember {
        mutableStateOf(product.isFavorite)
    }
    Box(
        modifier = Modifier
            .clickable { }
            .padding(10.dp)
            .height(260.dp)
            .shadow(elevation = 10.dp, spotColor = BlackData, ambientColor = BlackData)
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
                if (product.isNew) {
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
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.End
                ) {
                    IconToggleButton(
                        checked = productState,
                        onCheckedChange = { _checked ->
                            productState = !productState
                        },
                        modifier = Modifier
                            .offset(x = (-12).dp, y = 12.dp)
                    ) {
                        Image(
                            painter = if (!productState) painterResource(id = R.drawable.ic_favorite) else painterResource(
                                id = R.drawable.ic_favorite_filled
                            ),
                            contentDescription = "ic_favorite"
                        )
                    }
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
            GlideImage(
                model = product.productImage,
                modifier = Modifier
                    .clickable { }
                    .height(110.dp)
                    .width(90.dp),
                contentDescription = "product_image",
            )
            Spacer(modifier = Modifier.height(14.dp))
            Text(
                modifier = Modifier
                    .clickable { },
                text = product.productName,
                fontSize = 12.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF000000)
            )
            Spacer(modifier = Modifier.height(6.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                SetRating(product = product)
                Text(
                    modifier = Modifier
                        .padding(start = 5.dp)
                        .clickable { },
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
                    modifier = Modifier.clickable { },
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
    ProductsItem(
        ProductModel(
            1,
            "asusa",
            R.drawable.pic_product_image,
            "dfgvbrfbh",
            0,
            "vekfve,f",
            false,
            false,
            true
        )
    )
}

@Composable
fun SetRating(product: ProductModel) {
    var productRating by remember { mutableStateOf(product.productRating) }
    var ratingCheckedState1 by remember{ mutableStateOf(product.isRatingChecked) }
    var ratingCheckedState2 by remember{ mutableStateOf(product.isRatingChecked) }
    var ratingCheckedState3 by remember{ mutableStateOf(product.isRatingChecked) }
    var ratingCheckedState4 by remember{ mutableStateOf(product.isRatingChecked) }
    var ratingCheckedState5 by remember{ mutableStateOf(product.isRatingChecked) }
    if (product.productRating in 1..5) {

    } else {
        IconToggleButton(
            checked = ratingCheckedState1,
            onCheckedChange = {
                ratingCheckedState1 = !ratingCheckedState1
                productRating = 1
            }
        ) {
            Image(
                painter = if (productRating == 1) painterResource(id = R.drawable.ic_star_filled) else painterResource(
                    id = R.drawable.ic_star
                ),
                contentDescription = "ic_star_1"
            )
        }
        IconToggleButton(
            checked = ratingCheckedState2,
            onCheckedChange = {
                ratingCheckedState2 = !ratingCheckedState2
                productRating = 2
            }
        ) {
            Image(
                painter = if (productRating == 1) painterResource(id = R.drawable.ic_star_filled) else painterResource(
                    id = R.drawable.ic_star
                ),
                contentDescription = "ic_star_1"
            )
        }
        Image(
            modifier = Modifier.clickable {
                productRating = 3
            },
            painter = painterResource(id = R.drawable.ic_star),
            contentDescription = "ic_star",
            contentScale = ContentScale.None
        )
        Image(
            modifier = Modifier.clickable {
                productRating = 4
            },
            painter = painterResource(id = R.drawable.ic_star),
            contentDescription = "ic_star",
            contentScale = ContentScale.None
        )
        Image(
            modifier = Modifier.clickable {
                productRating = 5
            },
            painter = painterResource(id = R.drawable.ic_star),
            contentDescription = "ic_star",
            contentScale = ContentScale.None
        )
    }
}