package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SortType(
    modifier: Modifier = Modifier,
    list: MutableList<String>,
    isError: Boolean = false,
    supportText: String = "",
    onClick: ((String) -> Unit)? = null
) {
    var isExpanded by remember {
        mutableStateOf(false)
    }
    var selectedText by remember {
        mutableStateOf(list[0])
    }

    Box(
        modifier = modifier
    ) {

        ExposedDropdownMenuBox(
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(10.dp)),
            expanded = isExpanded,
            onExpandedChange = {
                isExpanded = !isExpanded
            }
        ) {
            OutlinedTextField(
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White
                ),
                shape = RoundedCornerShape(10.dp),
                value = selectedText,
                onValueChange = {},
                readOnly = true,
                textStyle = TextStyle(fontSize = 15.sp),
                isError = isError,
                supportingText = {
                    if (isError) Text(text = supportText)
                },
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded) },
                modifier = Modifier
                    .fillMaxWidth()
                    .menuAnchor()
                    .background(Color(0xFFFFFFFF))
            )

            ExposedDropdownMenu(
                modifier = Modifier
                    .background(Color(0xFFFFFFFF))
                    .border(width = 1.dp,color = Color.Black,shape = RoundedCornerShape(10.dp)),
                expanded = isExpanded,
                onDismissRequest = {
                    isExpanded = false
                }
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
                            }
                        },
                        onClick = {
                            selectedText = list[i]
                            isExpanded = false
                            onClick?.invoke(list[i])
                        }
                    )
                }
            }
        }
    }
}