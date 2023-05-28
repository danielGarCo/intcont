package com.example.git3

/**
 * Main
 *
 */
fun main() {
    detector(brix(30))
    detector(alcohol(38))
    detector(edadVerdadera(5))
}

/**
 * Detector
 *
 * @param tequilita
 *///funcion con nombre detector con tres if
fun detector(tequilita: tequila) {
    //Este if donde tequilita instancia a tequila
    if (tequilita is brix) {
        println("la cantidad de: ${tequilita.gradosbrix} grados brix estan en ${tequilita.cantidadLitros()}litros")

        return
    }
    //If donde tequilits esta en alcohol .
    if (tequilita is alcohol) {
        println("la cantidad de: ${tequilita.gradosalcohol} grados brix estan en ${tequilita.cantidadLitros()}litros")
        return
    }
    if(
        tequilita is edadVerdadera) {
        println("la cantidad de: ${tequilita.edadverdadera} grados brix estan en ${tequilita.cantidadLitros()}litros")
        return

    }


}


/*
    fun main190() {
        a("")
        b("")
    }

    //Función llamada a con un parametro
    fun a(b: String): Unit {
        println("Hola $b")

    }

    //funcion b con parametro
    fun b(b: String) {
        println("Hola $b")
    }
*/