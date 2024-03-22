package com.example.barcodeapp.solid

interface Animal {
    fun comer()
}

interface Mamifero: Animal {
    fun darLeche()
}

interface Ave: Animal {
    fun volar()
}

class Perro: Mamifero {
    override fun comer() {
        println("El perro está comiendo")
    }

    override fun darLeche() {
        println("La perra está dando leche")
    }
}

class Paloma: Ave {
    override fun comer() {
        println("La paloma está comiendo")
    }

    override fun volar() {
        println("La paloma está volando")
    }
}

fun main() {
    val perro = Perro()
    perro.comer()
    perro.darLeche()

    val paloma = Paloma()
    paloma.comer()
    paloma.volar()
}
/*En este ejemplo, se definen las interfaces Animal, Mamifero y Ave.
La interfaz Animal define el método comer, mientras que las interfaces Mamifero
y Ave definen métodos específicos para cada tipo de animal.*/