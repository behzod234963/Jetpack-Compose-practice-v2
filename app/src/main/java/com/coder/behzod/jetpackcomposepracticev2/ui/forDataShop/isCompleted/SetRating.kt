package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.coder.behzod.jetpackcomposepracticev2.R
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.ProductModel

@Composable
fun SetRating(product: ProductModel) {
    if(product.productRating >= 0){
        when(product.productRating){
            0->{
                Image(
                    painter = painterResource(id = R.drawable.ic_star),
                    contentDescription = "zero"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star),
                    contentDescription = "zero"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star),
                    contentDescription = "zero"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star),
                    contentDescription = "zero"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star),
                    contentDescription = "zero"
                )
            }
            1->{
                Image(
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "one"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star),
                    contentDescription = "one"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star),
                    contentDescription = "one"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star),
                    contentDescription = "one"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star),
                    contentDescription = "one"
                )
            }
            2->{
                Image(
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "two"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "two"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star),
                    contentDescription = "two"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star),
                    contentDescription = "two"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star),
                    contentDescription = "two"
                )
            }
            3->{
                Image(
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "three"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "three"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "three"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star),
                    contentDescription = "three"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star),
                    contentDescription = "three"
                )
            }
            4->{
                Image(
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "four"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "four"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "four"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "four"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star),
                    contentDescription = "four"
                )
            }
            5->{
                Image(
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "one"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "five"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "five"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "five"
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_star_filled),
                    contentDescription = "five"
                )
            }
        }
    }
}