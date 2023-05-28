package com.example.git3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.git3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

println("revisar"+simplificarUnaFuncion(4,5))
    }
    fun simplificarUnaFuncion (num1:Int, num2:Int):Int {
        return num1 + num2
    }}










    /*fun x(){

        var edad=17
        if (edad in 18..70) println("entra")
        else {

            println("No entra")

        }
Log.i("Veamos","Aqui estamos")
    }*/
 /*   fun nullSafety() {
        var marca: String="generalMotor"

        if (marca !=null){
            println(marca?.length)
        }
        else{
            println("marca es null")
        }

    }
}*/

