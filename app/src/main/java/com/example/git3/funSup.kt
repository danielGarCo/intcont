package com.example.git3

/**
 * Agencia
 *
 * @property marcaVehiculo
 * @property añoVehiculo
 * @constructor Create empty Agencia
 */
class Agencia(val marcaVehiculo:String, val añoVehiculo:Int){
    /**
     * Antiguedad
     *
     * @param fn
     * @receiver
     * @return
     */
    fun antiguedad(fn:(Int)-> Boolean): Boolean{
return fn(añoVehiculo)
    }

    /**
     * Clasico
     *
     * @param añoVehiculo
     * @return
     */
    fun clasico(añoVehiculo: Int):Boolean{
        if (añoVehiculo <=1980){
            return true
        }else return false

    }

    /**
     * Nuevo
     *
     * @param añoVehiculo
     * @return
     */
    fun nuevo(añoVehiculo: Int):Boolean{
        if (añoVehiculo  >=2018){
            return true
    }else return false
}

}