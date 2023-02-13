package com.example.git3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.git3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun x(){

        var edad=20
        if (edad<18) println("No entra")
        else {
            println("Puede pasar")
        }

    }
}