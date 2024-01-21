package com.coder.behzod.jetpackcomposepracticev2.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalFontLoader
import androidx.compose.ui.text.Paragraph
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coder.behzod.jetpackcomposepracticev2.ui.theme.ThemeColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DemoTextField() {
    var text by remember { mutableStateOf("") }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(ThemeColor.copy(0.7f))
                .padding(10.dp), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "AutoSize  TextField", fontWeight = FontWeight.Bold,
                color = Color.White
            )

            AutoSizableTextField(
                value = text,
                onValueChange = { text = it },
                maxLines = 3,
                minFontSize = 10.sp,
                modifier = Modifier
                    .padding(top = 20.dp, bottom = 20.dp)
                    .fillMaxWidth()
                    .height(150.dp)
            )

            Text(
                text = "TextField", fontWeight = FontWeight.Bold,
                color = Color.White
            )

            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                maxLines = 3,
                textStyle = TextStyle(fontSize = 32.sp),
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxWidth()
                    .height(150.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.White,
                    cursorColor = Color.White
                )
            )
        }
    }


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AutoSizableTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    fontSize: TextUnit = 32.sp,
    maxLines: Int = Int.MAX_VALUE,
    minFontSize: TextUnit,
    scaleFactor: Float = 0.9f,
) {
    BoxWithConstraints(
        modifier = modifier
    ) {

        var nFontSize = fontSize

        val calculateParagraph = @Composable {
            Paragraph(
                text = value,
                style = TextStyle(fontSize = nFontSize),
                density = LocalDensity.current,
                resourceLoader = LocalFontLoader.current,
                maxLines = maxLines,
                width = with(LocalDensity.current) { maxWidth.toPx() }
            )
        }

        var intrinsics = calculateParagraph()
        with(LocalDensity.current) {
            while ((intrinsics.height.toDp() > maxHeight || intrinsics.didExceedMaxLines) && nFontSize >= minFontSize) {
                nFontSize *= scaleFactor
                intrinsics = calculateParagraph()
            }
        }

        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier
                .fillMaxSize(),
            shape = RoundedCornerShape(8.dp),
            maxLines = maxLines,
            textStyle = TextStyle(fontSize = nFontSize),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color.White,
                cursorColor = Color.White
            )
        )
    }
}

@Preview
@Composable
fun PreviewDemoTextField() {
    DemoTextField()
}