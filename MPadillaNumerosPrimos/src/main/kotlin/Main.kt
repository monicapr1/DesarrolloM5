fun main (){
    println("Ingrese un número entero: ")
    val numero = readLine()!!.toInt() // !! forza el cambio de la cadema str a un int mientras que no sea nulo :)
    var numeroPrimo = true

    if (numero <= 1) {
        numeroPrimo = false

        }else {
            for (i in 2 until numero / 2 + 1) {
                if ( numero % i == 0) {
                    numeroPrimo = false
                    break
                }
            }
        }
        if (numeroPrimo) {
            println("Es primo")
        } else {
            println("No es primo")
        }
    }

