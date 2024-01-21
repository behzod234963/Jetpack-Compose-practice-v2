
package com.coder.behzod.jetpackcomposepracticev2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.coder.behzod.jetpackcomposepracticev2.ui.DemoTextField
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.CategoryRow
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.ProductsItem
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.SearchBar
import com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.SetTopAppBar
import com.coder.behzod.jetpackcomposepracticev2.ui.navigation.NavGraph
import com.coder.behzod.jetpackcomposepracticev2.ui.theme.JetpackComposePracticeV2Theme
import dev.bogibek.employees.view.CustomExposedDropdownMenuBox


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposePracticeV2Theme {
                NavGraph()
            }
        }
    }
}