package com.coder.behzod.jetpackcomposepracticev2.ui.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.SpecialForYouModel

@Composable
fun SpecialForYouItem(model:SpecialForYouModel,modifier: Modifier,contentScale: ContentScale) {
    Column {
        Card (
            shape = RoundedCornerShape(15.dp)
        ){
            Image(
                modifier = modifier,
                painter = painterResource(id = model.image),
                contentDescription = null,
                contentScale = contentScale
            )
        }
    }
}