
package com.coder.behzod.jetpackcomposepracticev2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.ExampleHorizontalPager
import com.coder.behzod.jetpackcomposepracticev2.ui.navigation.NavGraph
import com.coder.behzod.jetpackcomposepracticev2.ui.theme.JetpackComposePracticeV2Theme


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposePracticeV2Theme {
                ExampleHorizontalPager()
            }
        }
    }
}