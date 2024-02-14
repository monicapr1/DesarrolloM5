open class Animal {
    open fun hacerSonido() {
        println("Animal hace algún sonido")
    }
}

class Perro : Animal() {
    override fun hacerSonido() {
        println("Guau guau")
    }
}

class Gato : Animal() {
    override fun hacerSonido() {
        println("Miau miau")
    }
}
fun main() {
    val animal1: Animal = Perro()
    val animal2: Animal = Gato()

    animal1.hacerSonido() // Imprime "Guau guau"
    animal2.hacerSonido() // Imprime "Miau miau"
}