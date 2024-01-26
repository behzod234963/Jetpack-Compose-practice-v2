package com.coder.behzod.jetpackcomposepracticev2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.SetTopAppBar
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.favoriteScreen.FavoriteScreen
import com.coder.behzod.jetpackcomposepracticev2.ui.theme.JetpackComposePracticeV2Theme


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
            ) {
                SetTopAppBar()
                Divider()
                Spacer(modifier = Modifier.height(10.dp))
                FavoriteScreen()
            }
        }
    }
}