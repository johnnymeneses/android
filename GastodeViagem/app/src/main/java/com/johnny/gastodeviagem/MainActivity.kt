package com.johnny.gastodeviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_calcular = findViewById<Button>(R.id.btn_calcular)

        btn_calcular.setOnClickListener() {
            calculaViagem()
        }


    }


    fun calculaViagem() {


        var preco = findViewById<EditText>(R.id.edit_preco)
        var autonomia = findViewById<EditText>(R.id.edit_autonomia)
        var resultado = findViewById<TextView>(R.id.txt_resultado)
        var distancia = findViewById<EditText>(R.id.edit_distancia)


        val valorPreco = preco.text.toString().toDouble()
        val valorAutonomia = autonomia.text.toString().toDouble()
        val valorDistancia = distancia.text.toString().toDouble()

        val litrosNecessarioa = valorDistancia / valorAutonomia
        val resultadoGasto = litrosNecessarioa * valorPreco


        resultado.text = ("R$ ${resultadoGasto}")


    }


}

