package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop

import androidx.compose.ui.res.painterResource
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.TextStyle

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExposedDropDownMenuV3(){
    var isExpanded by remember{ mutableStateOf(false) }
    var isClicked: ((String)->Unit)? = null
    var onClicked:((String)->Unit)? = null
    val langs = listOf("O'z","Ru")
    var isSelected by remember{mutableStateOf(langs[0])}

    ExposedDropdownMenuBox(
        expanded = isExpanded,
        onExpandedChange = { isExpanded = !isExpanded }
    ) {
        OutlinedTextField(
            value = isSelected,
            onValueChange = {},
            readOnly = true,
            textStyle = TextStyle(fontSize = 20.sp),
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded) },
            modifier = Modifier.menuAnchor()
        )
        ExposedDropdownMenu(
            expanded = isExpanded,
            onDismissRequest = { isExpanded = false }
        ) {
            for (i in langs.indices){
                DropdownMenuItem(
                    text = {
                        Row (verticalAlignment = Alignment.CenterVertically){
                            Text(
                                text = langs[i],
                                modifier = Modifier.fillMaxWidth(1f)
                            )
                            if (i != 0 && langs.size != 1){
                                IconButton(
                                    onClick = {
                                        isClicked.invoke(langs[i])
                                    }) {
                                    Icon(
                                        painter = painterResource(
                                            id = {
                                                if (i == 0){
                                                }
                                            }
                                        ),
                                        contentDescription = ""
                                    )
                                }
                            }
                        }
                    },
                    onClick = { /*TODO*/ })
            }
        }
    }
}