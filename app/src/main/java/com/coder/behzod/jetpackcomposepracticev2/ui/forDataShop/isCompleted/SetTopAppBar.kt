package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coder.behzod.jetpackcomposepracticev2.R
import com.coder.behzod.jetpackcomposepracticev2.constants.LOCALE_LIST
import com.coder.behzod.jetpackcomposepracticev2.ui.theme.WhiteData


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SetTopAppBar(painter:Painter) {
    TopAppBar(
        modifier = Modifier
            .background(Color(0xFFFFFFFF)),
        colors = TopAppBarDefaults.topAppBarColors(
          containerColor = WhiteData
        ),
        title = {
            Image(
                modifier = Modifier
                    .height(35.dp)
                    .width(154.dp)
                    .background(Color.White),
                painter = painterResource(id = R.drawable.ic_data_logo_two),
                contentDescription = "logo",
            )
        },
        actions = {
            SetTopAppBarDropDownMenu(LOCALE_LIST, painter = painter)
        })
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SetTopAppBarDropDownMenu(
    list: MutableList<String>,
    onClick: (() -> Unit)? = null,
    editClick: ((String) -> Unit)? = null,
    painter:Painter
) {
    var isExpanded by remember { mutableStateOf(false) }
    var selectedText by remember { mutableStateOf(list[0]) }
    var isSelected by remember { mutableStateOf(false) }
    val flagsIndex = remember { mutableIntStateOf(0) }
    val localesIndex = remember { mutableIntStateOf(0) }
    val indicator = remember { mutableStateOf(false) }
    Row(
        modifier = Modifier
            .wrapContentWidth()
            .background(Color.White)
    ) {
        IconButton(
            modifier = Modifier
                .align(Alignment.CenterVertically),
            onClick = {

            }) {
            Icon(
                modifier = Modifier
                    .size(35.dp)
                    .padding(start = 10.dp),
                tint = Color.Black,
                painter = painter,
                contentDescription = "search"
            )
        }
        Spacer(modifier = Modifier.width(25.dp))
        ExposedDropdownMenuBox(
            modifier = Modifier
                .width(135.dp)
                .border(shape = RectangleShape, color = Color.White, width = 1.dp),
            expanded = isExpanded, onExpandedChange = { isExpanded = !isExpanded }
        ) {
            OutlinedTextField(
                leadingIcon = {
                    if (localesIndex.intValue == 1) indicator.value = false
                    if (localesIndex.intValue == 0) indicator.value = true
                    if (indicator.value){
                        Image(
                            modifier = Modifier
                                .size(28.dp),
                            painter = painterResource(id = R.drawable.ic_flag_uz),
                            contentDescription = ""
                        )
                    }else{
                        Image(
                            modifier = Modifier
                                .size(30.dp),
                            painter = painterResource(id = R.drawable.ic_flag_rus),
                            contentDescription = ""
                        )
                    }
                },
                value = selectedText,
                onValueChange = {},
                readOnly = true,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White
                ),
                shape = RectangleShape,
                textStyle = TextStyle(
                    fontSize = 20.sp,
                    color = Color.Black
                ),
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded) },
                modifier = Modifier
                    .fillMaxWidth()
                    .menuAnchor()
                    .background(Color.White)
                    .border(shape = RectangleShape, color = Color.White, width = 1.dp)
            )
            ExposedDropdownMenu(
                modifier = Modifier
                    .background(Color.White)
                    .border(shape = RectangleShape, color = Color.White, width = 1.dp),
                expanded = isExpanded,
                onDismissRequest = { isExpanded = false }
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
                                if (i != 0 && i != list.size - 1) {
                                    IconButton(
                                        onClick = {
                                            editClick?.invoke(list[i])
                                        }
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Edit,
                                            contentDescription = null,
                                            modifier = Modifier.size(18.dp)
                                        )
                                    }
                                }
                            }
                        },
                        onClick = {
                            flagsIndex.intValue = i
                            localesIndex.intValue = i
                            isSelected = !isSelected
                            isExpanded = false
                            selectedText = list[i]
                        }
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewSetTOpAppbar() {
    SetTopAppBar(painter = painterResource(id = R.drawable.ic_call))
}