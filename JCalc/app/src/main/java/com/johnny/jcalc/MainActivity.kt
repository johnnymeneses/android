package com.johnny.jcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        val visorGrande = findViewById<TextView>(R.id.visorGrande)

        val tecla0 = findViewById<Button>(R.id.tecla0)
        val tecla1 = findViewById<Button>(R.id.tecla1)
        val tecla2 = findViewById<Button>(R.id.tecla2)
        val tecla3 = findViewById<Button>(R.id.tecla3)
        val tecla4 = findViewById<Button>(R.id.tecla4)
        val tecla5 = findViewById<Button>(R.id.tecla5)
        val tecla6 = findViewById<Button>(R.id.tecla6)
        val tecla7 = findViewById<Button>(R.id.tecla7)
        val tecla8 = findViewById<Button>(R.id.tecla8)
        val tecla9 = findViewById<Button>(R.id.tecla9)
        val teclaC = findViewById<Button>(R.id.teclaC)

        val teclaAdicao = findViewById<Button>(R.id.teclaAdicao)
        val teclaIgual = findViewById<Button>(R.id.teclaIgual)

        var memoria = ""
        var resultado = 0
        var result = 0
        var adicao = false

        teclaC.setOnClickListener() {
            visorGrande.text = "0"
            memoria = ""
        }

        tecla0.setOnClickListener() {
            memoria += "0"
            visorGrande.text = memoria
        }

        tecla1.setOnClickListener() {
            memoria += "1"
            visorGrande.text = memoria
        }

        tecla2.setOnClickListener() {
            memoria += "2"
            visorGrande.text = memoria
        }

        tecla3.setOnClickListener() {
            memoria += "3"
            visorGrande.text = memoria
        }

        tecla4.setOnClickListener() {
            memoria += "4"
            visorGrande.text = memoria
        }

        tecla5.setOnClickListener() {
            memoria += "5"
            visorGrande.text = memoria
        }

        tecla6.setOnClickListener() {
            memoria += "6"
            visorGrande.text = memoria
        }

        tecla7.setOnClickListener() {
            memoria += "7"
            visorGrande.text = memoria
        }

        tecla8.setOnClickListener() {
            memoria += "8"
            visorGrande.text = memoria
        }

        tecla9.setOnClickListener() {
            memoria += "9"
            visorGrande.text = memoria
        }

        teclaAdicao.setOnClickListener(){
            resultado = memoria.toInt()
            memoria = ""
            adicao = true
        }

        teclaIgual.setOnClickListener(){
            if(adicao) {
               result =  resultado + memoria.toInt()
            }

            visorGrande.text = result.toString()
        }


    }
}
