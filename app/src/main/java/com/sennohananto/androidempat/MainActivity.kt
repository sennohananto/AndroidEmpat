package com.sennohananto.androidempat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myName = "Senno"
        Log.d("AND-4","Selamat Pagiii, $myName")

        //Halo nama saya Senno
        //Boleh kenalan nggak??
    }
}