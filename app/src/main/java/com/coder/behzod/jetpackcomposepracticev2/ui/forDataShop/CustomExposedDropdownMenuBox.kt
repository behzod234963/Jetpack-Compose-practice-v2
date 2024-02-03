package dev.bogibek.employees.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coder.behzod.jetpackcomposepracticev2.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomExposedDropdownMenuBox(
    list: MutableList<String>,
    onClick: (() -> Unit)? = null,
    editClick: ((String) -> Unit)? = null
) {
    var isExpanded by remember { mutableStateOf(false) }
    var selectedText by remember { mutableStateOf(list[0]) }
    var isSelected by remember { mutableStateOf(false) }
    ExposedDropdownMenuBox(
        modifier = Modifier
            .width(135.dp)
            .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(10.dp)),
        expanded = isExpanded, onExpandedChange = { isExpanded = !isExpanded }
    ) {
        OutlinedTextField(
            leadingIcon = {
                if (isSelected){
                    Image(
                        modifier = Modifier
                            .size(30.dp),
                        painter = painterResource(id = R.drawable.ic_flag_rus),
                        contentDescription = ""
                    )
                }else{
                    Image(
                        modifier = Modifier
                            .size(28.dp),
                        painter = painterResource(id = R.drawable.ic_flag_uz),
                        contentDescription = ""
                    )
                }
            },
            value = selectedText,
            onValueChange = {},
            readOnly = true,
            shape = RoundedCornerShape(10.dp ),
            textStyle = TextStyle(
                fontSize = 20.sp,
                color = Color.Black
            ),
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded) },
            modifier = Modifier
                .fillMaxWidth()
                .menuAnchor()
                .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(10.dp))
        )
        ExposedDropdownMenu(
            modifier = Modifier
                .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(10.dp)),
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
                        isSelected = !isSelected
                        isExpanded = false
                        selectedText = list[i]
                    }
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewExposedDropdownMenu() {
    CustomExposedDropdownMenuBox(list = mutableListOf("vdv,fd","dbnrg"))
}