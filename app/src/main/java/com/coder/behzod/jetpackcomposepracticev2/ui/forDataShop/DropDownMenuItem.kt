package dev.bogibek.employees.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropDownMenuItem(
    placeholder: String,
    modifier:Modifier?,
    list: MutableList<String>,
    onClick: (() -> Unit)? = null,
    editClick: ((String) -> Unit)? = null
) {
    var isExpanded by remember { mutableStateOf(false) }
    var selectedText by remember { mutableStateOf(list[0]) }
    var isSelected by remember { mutableStateOf(false) }
    ExposedDropdownMenuBox(
        modifier = Modifier
            .background(Color.White)
            .border(shape = RoundedCornerShape(5.dp), color = Color.Transparent, width = 0.dp),
        expanded = isExpanded, onExpandedChange = { isExpanded = !isExpanded }
    ) {
        OutlinedTextField(
            value = selectedText,
            onValueChange = {},
            readOnly = true,
            placeholder = {
                Text(
                    textAlign = TextAlign.Center,
                    text = placeholder!!,
                    fontSize = 12.sp,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF909090)
                )
            },
            shape = RoundedCornerShape(5.dp),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White
            ),
            textStyle = TextStyle(
                fontSize = 13.5.sp,
                color = Color.Black
            ),
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded) },
            modifier = Modifier
                .fillMaxWidth()
                .menuAnchor()
                .background(Color.White)
                .border(shape = RoundedCornerShape(5.dp), color = Color.White, width = 0.dp)
        )
        ExposedDropdownMenu(
            modifier = Modifier
                .background(Color.White)
                .border(shape = RoundedCornerShape(5.dp), color = Color.White, width = 0.dp),
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

                                }
                            }
                        }
                    },
                    onClick = {
                        isSelected = !isSelected
                        isExpanded = false
                        selectedText = list[i]
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDropDownMenuItem() {
//    DropDownMenuItem(null, list = mutableListOf("vdv,fd", "dbnrg"), placeholder = null)
}