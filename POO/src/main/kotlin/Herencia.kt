import java.util.*

fun main () {

}

abstract  class Vehicle (val wheels: Int){
    fun stop(){
        println("Freanr")
    }
    fun breake(){
        println("Estoy frendo con $wheels llantas")
    }
    open fun acelerar(){
        println("Acelerar")
    }

    abstract class Car(val brand:String, val masSpeed : Double,open val model:String):Vehicle(4){
        private  val vin: UUID = UUID.randomUUID()

        fun openDoors(){
            println("Abrindo puertas")
        }
        fun enableAC(){
            println("Aire prendido")
        }

    }
    class Tesla (override val model: String): Car("Tesla", 3000.0,model){
        fun autopilot(){
            println("")
        }
        fun charching(){
            println("Cargando")
        }
        override fun brake(){

        }
    }
}

