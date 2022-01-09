package com.johnny.jcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var visorGrande: TextView? = null

    private var teclaC: Button? = null
    private var teclaAdicao: Button? = null
    private var teclaSubtracao: Button? = null
    private var teclaIgual: Button? = null

    private var tecla4: Button? = null
    private var tecla5: Button? = null
    private var tecla6: Button? = null

    private var preMemoria: String = ""
    private var posMemoria: String = ""
    private var resultado: Int = 0

    private var adicao: Boolean = false
    private var subtracao: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        iniciaComponentes()

        teclaC?.setOnClickListener() {
            preMemoria = "" //Zerando a memoria
            visorGrande?.text = "0" //exibindo o numero zero, sem armazenar
        }

        tecla4?.setOnClickListener() {
            preMemoria += "4"
            visorGrande?.text = preMemoria
        }

        tecla5?.setOnClickListener() {
            preMemoria += "5"
            visorGrande?.text = preMemoria
        }

        teclaAdicao?.setOnClickListener() {
            adicao = true
            posMemoria = preMemoria //Trannsformar em função pra não ficar repetindo código?
            preMemoria = ""
        }

        teclaSubtracao?.setOnClickListener() {
            subtracao = true
            posMemoria = preMemoria
            preMemoria = ""
        }

        teclaIgual?.setOnClickListener() {

            if(adicao){
                resultado = posMemoria.toInt() + preMemoria.toInt()
                visorGrande?.text = resultado.toString()
                preMemoria = resultado.toString()
                adicao = false //desliga o comando de somar
            }

            if (subtracao){
                resultado = posMemoria.toInt() - preMemoria.toInt()
                visorGrande?.text = resultado.toString()
                preMemoria = resultado.toString()
                subtracao = false
            }



        }


    }



    fun iniciaComponentes() {

        visorGrande = findViewById<TextView>(R.id.visorGrande)

        teclaC = findViewById(R.id.teclaC)
        teclaAdicao = findViewById(R.id.teclaAdicao)
        teclaSubtracao = findViewById(R.id.teclaSubtracao)
        teclaIgual = findViewById(R.id.teclaIgual)
        tecla4 = findViewById(R.id.tecla4)
        tecla5 = findViewById(R.id.tecla5)
        tecla6 = findViewById(R.id.tecla6)
    }


}


//Ao apertar a tecla uma segunda vez, o numero queve ser incorporado como casa decimal: 4,44,444 -- OK
//Tecla C deve apagar o conteudo e substituir a preMemoria por um zero --OK

//Limitir o visor à X caracteres
//Logica para o botão igual não quebrar a aplicacao
