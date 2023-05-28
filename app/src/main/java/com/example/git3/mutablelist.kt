package com.example.git3

fun main(){
    val arboles= mutableListOf("Cedro", "pino", "Abedul", "Eucalipto")
    arboles.add(0,"Roble")//Agrega registro en el espacio 0

    println(arboles)
    arboles[2]="Abeto" //Modifica el registro en el espacio dos
    println(arboles)

}








