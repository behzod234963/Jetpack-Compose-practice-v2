package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.coder.behzod.jetpackcomposepracticev2.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun SetupTopAppBar() {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White))
    {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.07f)
                .background(Color.White), verticalAlignment = Alignment
                .CenterVertically
        ) {
            Image(
                painter = painterResource
                    (id = R.drawable.pic_logo_data),
                contentDescription = "logo",
                modifier = Modifier
                    .size(140.dp)
                    .padding(5.dp)
            )
            Box(contentAlignment = Alignment.CenterEnd) {
                Icon(painter =
                painterResource(id = R.drawable.ic_call),
                    contentDescription = "call center",
                    modifier = Modifier
                        .size(12.dp)
                        .clickable { },
                )
            }
        }
    }
}
