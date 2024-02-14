
// Clase abstracta Figura define un método calcularArea()
abstract class Figura {
    abstract fun calcularArea(): Double
}

// Clases que heredan de Figura proporcionando la implementación para el método
class Circulo(private val radio: Double) : Figura() {
    override fun calcularArea(): Double {
        return Math.PI * radio * radio
    }
}

class Cuadrado(private val lado: Double) : Figura() {
    override fun calcularArea(): Double {
        return lado * lado
    }
}

fun main() {
    val circulo = Circulo(5.0)
    println("Área del círculo: ${circulo.calcularArea()}") //Imprime 78.53981633974483


    val cuadrado = Cuadrado(4.0)
    println("Área del cuadrado: ${cuadrado.calcularArea()}") //Imprime 16.0
}
