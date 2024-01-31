package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coder.behzod.jetpackcomposepracticev2.R
import com.coder.behzod.jetpackcomposepracticev2.model.ProductModel
import java.util.ArrayList

@Composable
fun FavoriteScreen() {
    val productsModel = ArrayList<ProductModel>()
    productsModel.add(
        ProductModel(
        null,
            "HP Victus 15 RTX 3050 / i5 12400f / 512 GB SSD..",
            R.drawable.pic_product_image,
            "14.540.000 UZS",
            5,
            true,
            50
    )
    )
    productsModel.add(
        ProductModel(
            null,
            "HP Victus 15 RTX 3050 / i5 12400f / 512 GB SSD..",
            R.drawable.pic_product_image,
            "14.540.000 UZS",
            5,
            true,
            50
        )
    )
    productsModel.add(
        ProductModel(
            null,
            "HP Victus 15 RTX 3050 / i5 12400f / 512 GB SSD..",
            R.drawable.pic_product_image,
            "14.540.000 UZS",
            5,
            true,
            50
        )
    )
    productsModel.add(
        ProductModel(
            null,
            "HP Victus 15 RTX 3050 / i5 12400f / 512 GB SSD..",
            R.drawable.pic_product_image,
            "14.540.000 UZS",
            5,
            true,
            50
        )
    )
    productsModel.add(
        ProductModel(
            null,
            "HP Victus 15 RTX 3050 / i5 12400f / 512 GB SSD..",
            R.drawable.pic_product_image,
            "14.540.000 UZS",
            5,
            true,
            50
        )
    )
    productsModel.add(
        ProductModel(
            null,
            "HP Victus 15 RTX 3050 / i5 12400f / 512 GB SSD..",
            R.drawable.pic_product_image,
            "14.540.000 UZS",
            5,
            true,
            50
        )
    )
    productsModel.add(
        ProductModel(
            null,
            "HP Victus 15 RTX 3050 / i5 12400f / 512 GB SSD..",
            R.drawable.pic_product_image,
            "14.540.000 UZS",
            5,
            true,
            50
        )
    )
    productsModel.add(
        ProductModel(
            null,
            "HP Victus 15 RTX 3050 / i5 12400f / 512 GB SSD..",
            R.drawable.pic_product_image,
            "14.540.000 UZS",
            5,
            true,
            50
        )
    )


    val sortTypes = remember {
        mutableListOf(
            "Сначала дешевые",
            "Сначала дорогие",
            "По рейтингу",
            "Популярные"
        )
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding( start = 10.dp, end = 10.dp),
    ) {
        Box(
            modifier = Modifier
                .height(50.dp)
                .width(200.dp),
            contentAlignment = Alignment.TopStart
        ) {
            SortType(list = sortTypes)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 25.dp),
            contentAlignment = Alignment.BottomEnd
        ) {
            Text(
                modifier = Modifier
                    .clickable {  },
                text = "Очистить всe",
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF5E5E5E),
                    textDecoration = TextDecoration.Underline
                )
            )
        }
        LazyVerticalGrid(
            modifier = Modifier
                .padding(top = 60.dp),
            columns = GridCells.Fixed(2)
        ){
            items(productsModel.size)
            {
                ProductsItem(
                    ProductModel(
                        1,
                        "asus",
                        R.drawable.pic_product_image,
                        "5",
                        4,
                        "dsvdgrf",
                        false,
                        false

                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewFavoriteScreen() {
    FavoriteScreen()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SortType(
    modifier: Modifier = Modifier,
    list: MutableList<String>,
    isError: Boolean = false,
    supportText: String = "",
    onClick: ((String) -> Unit)? = null
) {
    var isExpanded by remember {
        mutableStateOf(false)
    }
    var selectedText by remember {
        mutableStateOf(list[0])
    }

    Box(
        modifier = modifier
    ) {

        ExposedDropdownMenuBox(
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 1.dp,color = Color.Black,shape = RoundedCornerShape(10.dp)),
            expanded = isExpanded,
            onExpandedChange = {
                isExpanded = !isExpanded
            }
        ) {
            OutlinedTextField(
                shape = RoundedCornerShape(10.dp),
                value = selectedText,
                onValueChange = {},
                readOnly = true,
                textStyle = TextStyle(fontSize = 15.sp),
                isError = isError,
                supportingText = {
                    if (isError) Text(text = supportText)
                },
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded) },
                modifier = Modifier
                    .fillMaxWidth()
                    .menuAnchor()
            )

            ExposedDropdownMenu(
                modifier = Modifier
                    .border(width = 1.dp,color = Color.Black,shape = RoundedCornerShape(10.dp)),
                expanded = isExpanded,
                onDismissRequest = {
                    isExpanded = false
                }
            ) {
                for (i in list.indices) {
                    DropdownMenuItem(
                        text = {
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    modifier = Modifier.weight(1f),
                                    text = list[i]
                                )
                            }
                        },
                        onClick = {
                            selectedText = list[i]
                            isExpanded = false
                            onClick?.invoke(list[i])
                        }
                    )
                }
            }
        }
    }
}