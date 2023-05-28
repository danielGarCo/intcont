package com.example.git3



fun main(){
    val resultado = validarParametros("correcto", "correcto", validacion)
    println(resultado)
}
fun validarParametros(parametro1: String, parametro2: String, validacion:( (String, String) -> Boolean)): String {
    if (validacion(parametro1, parametro2)) {
        return "Los parámetros son correctos."
    } else {
        return "No es correcto"
    }
}
val validacion: (String, String) -> Boolean = { parametro1, parametro2 -> parametro1 == "correcto" && parametro2 == "incorrecto" }