package com.example.git3

fun main(){
    println("Escribe un numero")
    var num= readLine()?.toInt()
    if (num in 1..15 ){
        println("eres joven") }
        if (num in 16..40 ){
            println("Eres Adulto joven") }
        if (num in 41..65  ){
            println("Eres adulto") }

}
