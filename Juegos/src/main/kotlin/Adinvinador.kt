/*
* Generacion del numero aleaotorio entre dos rangos
* El usuario selecciona un numero al azar
* Si el usuario no adivino el numero se le dara una pista
* Si el usuario adivina el numero sera el ganador y se mostrara en cuantos intentos lo logro
*
* */

fun main() {
    val minRange = 1
    val maxRange = 20
    val numberToGuess = (minRange..maxRange).random()
    var attempts = 0
    var guess: Int?

    println("Bienvenido al juego Adivina el numero")
    println("Estoy pensando en un numero entre $minRange y $maxRange. Adivinalo")

    do {
        println("Ingresa tu suposicion")
        guess = readln().toIntOrNull()


        if(guess != null){
            attempts++
            when {
                guess < numberToGuess -> println("El numero que estoy pensando es mayor")
                guess > numberToGuess -> println("El numero que estoy pensando es menor")
                else -> print("Felicidades has adivinado el numero en $attempts intentos")
            }
        }
        else {
            println("Por favor ingresa un numero valido")
        }

    }
    while (guess != numberToGuess)
}