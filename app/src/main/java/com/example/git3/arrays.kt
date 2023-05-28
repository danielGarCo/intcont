package com.example.git3

fun main(){
    var arreglo= arrayOf("Norte","Sur","Este", "Oeste","Sureste")
    arreglo += "Noreste"
    println(arreglo.contentToString())
    println(arreglo.get(1))
}
