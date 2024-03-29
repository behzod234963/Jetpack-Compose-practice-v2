package com.coder.behzod.jetpackcomposepracticev2.ui.forDataShop.isCompleted

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.coder.behzod.jetpackcomposepracticev2.constants.ALL_PROGRAMMERS
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import java.util.Locale

class MainViewModel: ViewModel() {
    private val _searchText = MutableStateFlow("")
    val searchText = _searchText.asStateFlow()
    private val _isSearching = MutableStateFlow(false)
    val isSearching = _isSearching.asStateFlow()
    private val _programmers = MutableStateFlow(ALL_PROGRAMMERS)
    @OptIn(FlowPreview::class)
    val programmers = searchText
        .debounce(500L)
        .onEach { _isSearching.update { true } }
        .combine(_programmers){text,programmers->
        if (text.isBlank()){
            programmers
        }else{
            delay(1000L)
            programmers.filter {
                it.matchSearchQuery(text)
            }
        }
    }
        .onEach { _isSearching.update { false } }
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            _programmers.value
        )
    fun searchTextChange(text:String){
        _searchText.value= text
    }
}
data class Programmer(
    val firstName:String,
    val lastName:String
){
    fun matchSearchQuery(query:String):Boolean{
        val matchingCombinations = listOf(
            "$firstName$lastName".toLowerCase(Locale.ROOT),
            "$firstName $lastName".toLowerCase(Locale.ROOT),
            "${firstName.first()}${lastName.first()}".toLowerCase(Locale.ROOT),
            "${firstName.first()} ${lastName.first()}".toLowerCase(Locale.ROOT)
        )
        return matchingCombinations.any{
            it.contains(query, ignoreCase = true)
        }
    }
}