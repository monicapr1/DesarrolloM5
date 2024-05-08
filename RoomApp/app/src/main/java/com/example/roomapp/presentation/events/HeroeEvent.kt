package com.example.roomapp.presentation.events


sealed class HeroeEvent {
    data class OnGetHeroe (val name: String) : HeroeEvent()
    object OnDelete : HeroeEvent()
}