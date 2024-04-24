package com.example.barcodeapp.corroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


private const val SEPARATOR = "========="
fun newTopic (topic:String){
    println("\n $SEPARATOR $topic $SEPARATOR")
}
fun main(){
    newTopic("Corrutinas")
    //globalScope()
    //println("Trabajando en el hilo principal")
   // GlobalScope.launch {
     //   suspendFun()
    //}

    newTopic("Constructores")
    //cRunBlocking()
    //cLaunch()
    //cAsync()
    job()
    readln()
}



fun globalScope(){
    newTopic("Global Scope")
    GlobalScope.launch {
        println("Mi primera corrutina")
        delay(2000)
        println("Trabajando en otra cosa")
    }
}

suspend fun suspendFun(){
    newTopic("Suspend fun")
    println("Estamos recopilando datos")
    delay(5000)
    println("Termine de  recopilar datos")

}

fun cRunBlocking(){
    newTopic("Run Blocking")
    runBlocking {
        println("Iniciando consulta API")
        delay(1000)
        println("Termino")
    }
}

fun cLaunch(){
    newTopic("Launch")
    runBlocking {
        launch {
            println("Launch")
            delay(1000)
            println("Trabajando en otra cosa")
        }
    }
}

fun cAsync(){
    newTopic("Async")
    runBlocking {
        val result = async {
            println("consultando base de datos")
            delay(1000)
            "Datos"
        }
        println("El resultado es ${result.await()}")
    }
}

fun job(){
    newTopic("Job")
    runBlocking {
        val job = launch {
            println("Iniciando peticion API")
            delay(3000)
            println("Datos traidos")
            println("Terminando job")
        }
        delay(500)
        println("isActive: ${job.isActive}")
        println("isCompleted: ${job.isCompleted}")
        println("isCancelled: ${job.isCancelled}")


        job.cancel()
        println("Tarea cancelada")


        println("isActive: ${job.isActive}")
        println("isCompleted: ${job.isCompleted}")
        println("isCancelled: ${job.isCancelled}")

    }
}