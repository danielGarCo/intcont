@file:OptIn(ExperimentalContracts::class)

package com.example.git

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

fun main(){
val pass:String?=obtenerpass()
if(validatepass(pass)){
    println(pass.length)


}

}

fun obtenerpass(): String? {

   return  "+123239" ?: null

}
fun validatepass(pass:String?):Boolean{
    contract { returns(true) implies (pass is String) }
    if (pass==null)   return false

    return "^\\+[0-9]{5,9}$".toRegex().matches(pass)
}



