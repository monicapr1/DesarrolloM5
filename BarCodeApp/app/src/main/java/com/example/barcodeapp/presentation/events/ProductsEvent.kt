package com.example.barcodeapp.presentation.events

sealed class ProductsEvent {

    data class OnScan(val barcode:String) : ProductsEvent()

    object OnDelete : ProductsEvent()
}