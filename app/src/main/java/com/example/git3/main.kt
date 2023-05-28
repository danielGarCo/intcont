package com.example.git3

import android.webkit.WebView.FindListener
import java.io.File
fun main18(){
    val arreglo = arrayOf("Ford","Chevrolet","Mazda","Nissan")
    if("Ford" in arreglo){
        arreglo.forEach { println(it) }
    }else{
        println("No esta Ford")
    }
}
fun main17(){

    val arreglo = arrayOf(1, 2, 3, 4, 5)
//    arreglo.forEach { i -> println(i)
for (i in arreglo){
    println("Numero  ${i+1} en ${arreglo[i]} ")
}

}

//mapOf
fun main16(){
    val mapaDeNumeros= mapOf(1 to "manzana", 2 to "Pera", 3 to "Mandarina", 4 to "Sandia")
mapaDeNumeros.forEach{ println(it) }
    println(mapaDeNumeros.get(1))
    println(mapaDeNumeros.size)

}
fun main15(){
    val a= listOf("Jet","Hercules", "Kaza","Helicoptero")
    if ("boin" !in a){
        println("No esta")
} else{
    println("si esta")
    }

}

fun main14(){
File("\\Lectura.txt").forEachLine { println(it) }

}

fun main13(){
val a= arrayOf ("Mexico","USA","Cuba","argentina")
    //for (u in a){
        //println("El pais  numero ${u+1} es ${a[u]} ")
    a.forEach { println(it) }

}


fun main12(){
   val a:List<String> = listOf("Mercurio","Venus", "Tierra", "Marte", "Jupiter")
    println(a.size)
println(a)
    println(a.get(1))
    val b=a.filter { it=="Marte" || it== "Venus" }
println(b)
a.forEach { println("Planeta $it") }
    a.forEach { println(a) }

}






fun main19 (){
    var a:String?="Mexico"

    if (!a.isNullOrEmpty()){
        println(a.reversed())
    }

}


fun main3(){
    var indice = 0
    var paises= arrayOf("Mexico","Cuba","Brasil","USA", "Colombia")

    paises.forEach {println("El pais  es $it")
        indice++
    }

   for(i in paises.indices){

       println("Pais $i es ")
    }

}



fun main2(){
    val a:Long
    var b=0
    var c=1
    println("Ingresa un numero")
    a= readln().toLong()
    if (a>0 ){
        (1.. a).forEach{
            println(b)
            c += b
            b=c-b
        }
    }else{"No valido"

    }

}
fun main1 (){


    val array = arrayOf(1, 2, 3)

    try {
        println("Escribe un numero")
        val index= readln().toInt()
        println("El elemento en el índice $index es ${array[index]}")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("El índice está fuera del rango del arreglo")
        println(e)
    } catch (e: Exception) {
        println("Ha ocurrido un error desconocido")
        println(e)
    }
}

