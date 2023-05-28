package com.example.git3

/**
 * Main
 *
 */
fun main() {
        val agencia = Agencia("Toyota", 2010)//se instancia la clase agencia.

        val esClasico = agencia.antiguedad { agencia.clasico(it) } /*Instanciamos el metodo antiguedad que recibe los argumentos de (FN que es la
        funcion superior un Int y devuelve un boolean, la expresión lambda y llamamos
        al metodo clasico(que verifica si es mayor de 30)  (despues tomamos el it para el año),
       */
        println("¿Es un clásico? $esClasico") //Se imprime si fuera clasico. pero como es del años 2010 imprime false porque devuelve boolean

        val esNuevo = agencia.antiguedad { agencia.nuevo(it) } // lo anterior pero el metodo verifica si menor de entre 1 y 4 años
        println("¿Es un vehículo nuevo? $esNuevo")//en este caso se imprime false igual que la variable anterior
    }