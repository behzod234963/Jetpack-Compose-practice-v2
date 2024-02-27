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
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coder.behzod.jetpackcomposepracticev2.R
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.AdsModel
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted.CategoryModel

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ExampleHorizontalPager(adsModel:AdsModel) {
    val screens = listOf(
        "Screen1",
        "Screen2",
        "Screen3",
        "Screen4"
    )
    val adsList = ArrayList<AdsModel>()
    adsList.add(
        AdsModel(
            1,
            "HP VICTUS",
            "15",
            null,
            "СОЗДАН ДЛЯ",
            "ПРОФЕССИОНАЛОВ",
            "ОТ ПРОФЕССИОНАЛОВ",
            R.drawable.pic_laptop
        )
    )
    val whiteColor = Color(0xFFB0B0B0)
    val grayColor = Color(0xFF353535)
    val pagerState = rememberPagerState (pageCount = {screens.size})
    val selectedPageIndex = remember{
        derivedStateOf { pagerState.currentPage }
    }
    HorizontalPager(state = pagerState) {page->
        Row(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
                .background(color = Color(0xFF994545), shape = RoundedCornerShape(20.dp)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ){
            when(page){
                0->{ HorizontalPagerScreen1(adsModel,whiteColor,grayColor,null) }
                1->{ HorizontalPagerScreen2() }
                2->{ HorizontalPagerScreen3() }
                3->{ HorizontalPagerScreen4() }
            }
        }

    }
}

@Composable
fun HorizontalPagerScreen1(
    model:AdsModel,
    firstColor:Color,
    secondColor: Color?,
    thirdColor: Color?
) {
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
                text = model.adsFirstProductName,
                fontSize = 25.sp,
                color = firstColor
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 140.dp, bottom = 90.dp),
                text = model.adsSecondProductName!!,
                fontSize = 25.sp,
                color = secondColor!!
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 10.dp),
                text = model.adsFirstDescription!!,
                fontSize = 14.5.sp,
                color = firstColor
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 107.dp),
                text = model.adsSecondDescription!!,
                fontSize = 14.5.sp,
                color = secondColor
            )
            Text(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 10.dp, top = 35.dp),
                text = model.adsThirdDescription!!,
                fontSize = 14.5.sp,
                color = firstColor
            )
            Image(
                modifier = Modifier
                    .offset(x = 15.dp)
                    .align(Alignment.CenterEnd),
                painter = painterResource(model.adsImage!!),
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

//
//@Preview
//@Composable
//fun PreviewHorizontalPager() {
//    ExampleHorizontalPager(Ads)
//}