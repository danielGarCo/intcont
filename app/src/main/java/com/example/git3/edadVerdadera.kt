package com.example.git3

/**
 * Edad verdadera
 *
 * @property edadverdadera
 * @constructor Create empty Edad verdadera
 */
class edadVerdadera(val edadverdadera: Int):tequila {
    override fun cantidadLitros()=edadverdadera*3
}

/**
 * Brix
 *
 * @property gradosbrix
 * @constructor Create empty Brix
 */
class brix(val gradosbrix:Int):tequila{
    override fun cantidadLitros()=gradosbrix*4
}

/**
 * Alcohol
 *
 * @property gradosalcohol
 * @constructor Create empty Alcohol
 */
class  alcohol(val gradosalcohol:Int):tequila{
    override fun cantidadLitros()=gradosalcohol*4
    }