package com.johnny.udemy2


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()


        val numOne = findViewById<Button>(R.id.num1)
        val numbTwo = findViewById<Button>(R.id.num2)
        val numbThree = findViewById<Button>(R.id.num3)
        val numbFour = findViewById<Button>(R.id.num4)
        val numbFive = findViewById<Button>(R.id.num5)
        val numbSix = findViewById<Button>(R.id.num6)
        val numbSeven = findViewById<Button>(R.id.num7)
        val numbEight = findViewById<Button>(R.id.num8)

        val textoSair = findViewById<Button>(R.id.btnSairr)



        numOne.setOnClickListener { ex01() }
        numbTwo.setOnClickListener { ex02() }
        numbThree.setOnClickListener { ex03() }
        numbFour.setOnClickListener { ex04() }
        numbFive.setOnClickListener { ex05() }
        numbSix.setOnClickListener { ex06() }
        numbSeven.setOnClickListener { ex07() }
        numbEight.setOnClickListener { ex08() }


        textoSair.setOnClickListener { sair() }

    }


    fun ex01() {
        val intent = Intent(this, ex01::class.java)
        startActivity(intent)
    }

    fun ex02() {
        val intent = Intent(this, ex02::class.java)
        startActivity(intent)
    }

    fun ex03() {
        val intent = Intent(this, ex03::class.java)
        startActivity(intent)
    }




    fun sair() {
        onDestroy()
    }


}