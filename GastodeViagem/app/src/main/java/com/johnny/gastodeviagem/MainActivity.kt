package com.johnny.gastodeviagem

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btncalcular = findViewById<Button>(R.id.btn_calcular)

        btncalcular.setOnClickListener(this)

//        btncalcular.setOnClickListener() {
//            calculaViagem()
//        }


    }

    override fun onClick(view: View) {
        //Localizar qual evento será usando no OnCLick...Sei lá...
        val id = view.id

        if (id == R.id.btn_calcular) {
            calculate()
//            calculaViagem()
        }

        //Outro botão
        //  to do ...

    }


    private fun calculate() {

        if (validate()) {

            var preco = findViewById<EditText>(R.id.edit_preco)
            var autonomia = findViewById<EditText>(R.id.edit_autonomia)
            var resultado = findViewById<TextView>(R.id.txt_resultado)
            var distancia = findViewById<EditText>(R.id.edit_distancia)

            val valorPreco = preco.text.toString().toDouble()
            val valorAutonomia = autonomia.text.toString().toDouble()
            val valorDistancia = distancia.text.toString().toDouble()

            val resultadoGasto = (valorDistancia * valorPreco) / valorAutonomia
            resultado.text = ("R$ ${"%.2f".format(resultadoGasto)}")
        } else {
            Toast.makeText(this, getString(R.string.notificationCampos), Toast.LENGTH_LONG).show()
        }

    }

    private fun validate(): Boolean {

        var preco = findViewById<EditText>(R.id.edit_preco)
        var autonomia = findViewById<EditText>(R.id.edit_autonomia)
        var distancia = findViewById<EditText>(R.id.edit_distancia)

        val valorPreco = preco.text.toString()
        val valorAutonomia = autonomia.text.toString()
        val valorDistancia = distancia.text.toString()

        return (valorPreco != "" && valorAutonomia != "" && valorDistancia != "")


    }


    //Minha versão, sem ver as aulas
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

