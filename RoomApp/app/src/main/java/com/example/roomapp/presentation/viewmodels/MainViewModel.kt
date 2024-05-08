package com.example.roomapp.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.roomapp.domain.models.Heroe
import com.example.roomapp.domain.use_cases.GetHeroe
import com.example.roomapp.presentation.states.HeroeState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.lang.Exception
import android.util.Log
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getHeroes: GetHeroe
): ViewModel() {
    private  val _state = MutableStateFlow(HeroeState())
    val state = _state.asStateFlow()
    private val _uiEvent = Channel<String> ()
    val uiEvent = _uiEvent.receiveAsFlow()
    init {

        viewModelScope.launch {
            try {
                getHeroes().collect{
                    _state.value = HeroeState(heroes = it)
                }
            }catch (e: Exception){
                Log.i("Error", e.toString())
            }
        }
    }
}
