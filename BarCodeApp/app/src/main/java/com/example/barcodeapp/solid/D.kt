package com.example.barcodeapp.solid

interface IStorage {
    fun leer()
    fun escribir()
}
class SSD :IStorage{
    override fun leer() {
        TODO("Not yet implemented")
    }

    override fun escribir() {
        TODO("Not yet implemented")
    }

}
class HDD :IStorage{
    override fun leer() {
        TODO("Not yet implemented")
    }

    override fun escribir() {
        TODO("Not yet implemented")
    }

}
class Computadora(val storage : IStorage){
    fun guardarDatois(){
        storage.escribir()
    }
    fun recuperarDatos(){
        storage.leer()
    }

}
fun main (){
    val ssd :SSD =SSD()
    val hdd :HDD = HDD()
}
