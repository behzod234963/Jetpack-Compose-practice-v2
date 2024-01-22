package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coder.behzod.jetpackcomposepracticev2.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ExampleHorizontalPager() {
    val pagerState = rememberPagerState(pageCount = {
        4
    })
    HorizontalPager(state = pagerState) {page->
        when(page){
            1->{ HorizontalPagerScreen1() }
            2->{ HorizontalPagerScreen2() }
            3->{ HorizontalPagerScreen3() }
            4->{ HorizontalPagerScreen4() }
        }
    }
}

@Composable
fun HorizontalPagerScreen1() {
    Row(
        modifier = Modifier
            .height(200.dp)
            .fillMaxWidth()
            .background(color = Color(0xFF994545), shape = RoundedCornerShape(20.dp)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
        ){
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 10.dp, bottom = 90.dp),
                text = "HP VICTUS ",
                fontSize = 25.sp,
                color = Color.White
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 140.dp, bottom = 90.dp),
                text = "15",
                fontSize = 25.sp,
                color = Color.DarkGray
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 10.dp),
                text = "СОЗДАН ДЛЯ",
                fontSize = 14.5.sp,
                color = Color.White
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 107.dp),
                text = "ПРОФЕССИОНАЛОВ",
                fontSize = 14.5.sp,
                color = Color.DarkGray
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 10.dp, top = 35.dp),
                text = "ОТ ПРОФЕССИОНАЛОВ",
                fontSize = 14.5.sp,
                color = Color.White
            )
            Image(
                modifier = Modifier
                    .offset(x = 15.dp)
                    .align(Alignment.CenterEnd),
                painter = painterResource(id = R.drawable.pic_laptop),
                contentDescription = "laptop"
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 10.dp),
                contentAlignment = Alignment.BottomCenter
            ){
                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ){
                    Image(
                        modifier = Modifier
                            .padding(end = 5.dp),
                        painter = painterResource(id = R.drawable.ic_circle_black),
                        contentDescription = "circle"
                    )
                    Image(
                        modifier = Modifier
                            .padding(horizontal = 5.dp),
                        painter = painterResource(id = R.drawable.ic_circle_white),
                        contentDescription = "circle"
                    )
                    Image(
                        modifier = Modifier
                            .padding(horizontal = 5.dp),
                        painter = painterResource(id = R.drawable.ic_circle_white),
                        contentDescription = "circle"
                    )
                    Image(
                        modifier = Modifier
                            .padding(start = 5.dp),
                        painter = painterResource(id = R.drawable.ic_circle_white),
                        contentDescription = "circle"
                    )
                }
            }
        }
    }
}
@Composable
fun HorizontalPagerScreen2() {
    Row(
        modifier = Modifier
            .height(200.dp)
            .fillMaxWidth()
            .background(color = Color(0xFF994545), shape = RoundedCornerShape(20.dp)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
        ){
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 10.dp, bottom = 90.dp),
                text = "HP VICTUS ",
                fontSize = 25.sp,
                color = Color.White
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 140.dp, bottom = 90.dp),
                text = "15",
                fontSize = 25.sp,
                color = Color.DarkGray
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 10.dp),
                text = "СОЗДАН ДЛЯ",
                fontSize = 14.5.sp,
                color = Color.White
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 107.dp),
                text = "ПРОФЕССИОНАЛОВ",
                fontSize = 14.5.sp,
                color = Color.DarkGray
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 10.dp, top = 35.dp),
                text = "ОТ ПРОФЕССИОНАЛОВ",
                fontSize = 14.5.sp,
                color = Color.White
            )
            Image(
                modifier = Modifier
                    .offset(x = 15.dp)
                    .align(Alignment.CenterEnd),
                painter = painterResource(id = R.drawable.pic_laptop),
                contentDescription = "laptop"
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 10.dp),
                contentAlignment = Alignment.BottomCenter
            ){
                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ){
                    Image(
                        modifier = Modifier
                            .padding(end = 5.dp),
                        painter = painterResource(id = R.drawable.ic_circle_white),
                        contentDescription = "circle"
                    )
                    Image(
                        modifier = Modifier
                            .padding(horizontal = 5.dp),
                        painter = painterResource(id = R.drawable.ic_circle_black),
                        contentDescription = "circle"
                    )
                    Image(
                        modifier = Modifier
                            .padding(horizontal = 5.dp),
                        painter = painterResource(id = R.drawable.ic_circle_white),
                        contentDescription = "circle"
                    )
                    Image(
                        modifier = Modifier
                            .padding(start = 5.dp),
                        painter = painterResource(id = R.drawable.ic_circle_white),
                        contentDescription = "circle"
                    )
                }
            }
        }
    }
}
@Composable
fun HorizontalPagerScreen3() {
    Row(
        modifier = Modifier
            .height(200.dp)
            .fillMaxWidth()
            .background(color = Color(0xFF994545), shape = RoundedCornerShape(20.dp)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
        ){
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 10.dp, bottom = 90.dp),
                text = "HP VICTUS ",
                fontSize = 25.sp,
                color = Color.White
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 140.dp, bottom = 90.dp),
                text = "15",
                fontSize = 25.sp,
                color = Color.DarkGray
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 10.dp),
                text = "СОЗДАН ДЛЯ",
                fontSize = 14.5.sp,
                color = Color.White
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 107.dp),
                text = "ПРОФЕССИОНАЛОВ",
                fontSize = 14.5.sp,
                color = Color.DarkGray
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 10.dp, top = 35.dp),
                text = "ОТ ПРОФЕССИОНАЛОВ",
                fontSize = 14.5.sp,
                color = Color.White
            )
            Image(
                modifier = Modifier
                    .offset(x = 15.dp)
                    .align(Alignment.CenterEnd),
                painter = painterResource(id = R.drawable.pic_laptop),
                contentDescription = "laptop"
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 10.dp),
                contentAlignment = Alignment.BottomCenter
            ){
                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ){
                    Image(
                        modifier = Modifier
                            .padding(end = 5.dp),
                        painter = painterResource(id = R.drawable.ic_circle_white),
                        contentDescription = "circle"
                    )
                    Image(
                        modifier = Modifier
                            .padding(horizontal = 5.dp),
                        painter = painterResource(id = R.drawable.ic_circle_white),
                        contentDescription = "circle"
                    )
                    Image(
                        modifier = Modifier
                            .padding(horizontal = 5.dp),
                        painter = painterResource(id = R.drawable.ic_circle_black),
                        contentDescription = "circle"
                    )
                    Image(
                        modifier = Modifier
                            .padding(start = 5.dp),
                        painter = painterResource(id = R.drawable.ic_circle_white),
                        contentDescription = "circle"
                    )
                }
            }
        }
    }
}
@Composable
fun HorizontalPagerScreen4() {
    Row(
        modifier = Modifier
            .height(200.dp)
            .fillMaxWidth()
            .background(color = Color(0xFF994545), shape = RoundedCornerShape(20.dp)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
        ){
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 10.dp, bottom = 90.dp),
                text = "HP VICTUS ",
                fontSize = 25.sp,
                color = Color.White
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 140.dp, bottom = 90.dp),
                text = "15",
                fontSize = 25.sp,
                color = Color.DarkGray
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 10.dp),
                text = "СОЗДАН ДЛЯ",
                fontSize = 14.5.sp,
                color = Color.White
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 107.dp),
                text = "ПРОФЕССИОНАЛОВ",
                fontSize = 14.5.sp,
                color = Color.DarkGray
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 10.dp, top = 35.dp),
                text = "ОТ ПРОФЕССИОНАЛОВ",
                fontSize = 14.5.sp,
                color = Color.White
            )
            Image(
                modifier = Modifier
                    .offset(x = 15.dp)
                    .align(Alignment.CenterEnd),
                painter = painterResource(id = R.drawable.pic_laptop),
                contentDescription = "laptop"
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 10.dp),
                contentAlignment = Alignment.BottomCenter
            ){
                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ){
                    Image(
                        modifier = Modifier
                            .padding(end = 5.dp),
                        painter = painterResource(id = R.drawable.ic_circle_white),
                        contentDescription = "circle"
                    )
                    Image(
                        modifier = Modifier
                            .padding(horizontal = 5.dp),
                        painter = painterResource(id = R.drawable.ic_circle_white),
                        contentDescription = "circle"
                    )
                    Image(
                        modifier = Modifier
                            .padding(horizontal = 5.dp),
                        painter = painterResource(id = R.drawable.ic_circle_white),
                        contentDescription = "circle"
                    )
                    Image(
                        modifier = Modifier
                            .padding(start = 5.dp),
                        painter = painterResource(id = R.drawable.ic_circle_black),
                        contentDescription = "circle"
                    )
                }
            }
        }
    }
}


@Preview
@Composable
fun PreviewHorizontalPager() {
    HorizontalPagerScreen2()
}