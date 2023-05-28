package com.example.git3

fun main(){

    val caracteres: String? = null

    try {

        val length = caracteres!!.length
        println("La longitud de la cadena es $length")
    } catch (e: NullPointerException) {

        println("La variable es null")
        println(e)
    }
}

