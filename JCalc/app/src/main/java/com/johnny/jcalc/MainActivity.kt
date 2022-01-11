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
    private var teclaMultiplicacao: Button? = null
    private var teclaDivisao: Button? = null
    private var teclaIgual: Button? = null


    private var tecla1: Button? = null
    private var tecla2: Button? = null
    private var tecla3: Button? = null
    private var tecla4: Button? = null
    private var tecla5: Button? = null
    private var tecla6: Button? = null
    private var tecla7: Button? = null
    private var tecla8: Button? = null
    private var tecla9: Button? = null
    private var tecla0: Button? = null


    private var preMemoria: String = ""
    private var posMemoria: String = ""
    private var resultado: Int = 0

    private var adicao: Boolean = false
    private var subtracao: Boolean = false
    private var divisao: Boolean = false
    private var multiplicacao: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

        iniciaComponentes()

        teclaC?.setOnClickListener() { teclaC() }

        tecla1?.setOnClickListener { tecla1() }
        tecla2?.setOnClickListener { tecla2() }
        tecla3?.setOnClickListener { tecla3() }
        tecla4?.setOnClickListener { tecla4() }
        tecla5?.setOnClickListener { tecla5() }
        tecla6?.setOnClickListener { tecla6() }
        tecla7?.setOnClickListener { tecla7() }
        tecla8?.setOnClickListener { tecla8() }
        tecla9?.setOnClickListener { tecla9() }
        tecla0?.setOnClickListener { tecla0() }


        teclaAdicao?.setOnClickListener {funcaoSoma() }
        teclaIgual?.setOnClickListener { funcaoIgual()}
        teclaSubtracao?.setOnClickListener {funcaoSubtrair()}
        teclaMultiplicacao?.setOnClickListener {funcaoMultiplicar()}
        teclaDivisao?.setOnClickListener {funcaoDividir()}


    }

    fun teclaC() {
        preMemoria = "" //Zerando a memoria
        visorGrande?.text = "0" //exibindo o numero zero, sem armazenar
    }

    fun funcaoSoma(){
        adicao = true
        subtracao = false
        multiplicacao = false
        divisao = false

        posMemoria = preMemoria
        if (preMemoria != "") preMemoria = ""

    }

    fun funcaoMultiplicar() {
        multiplicacao = true
        adicao = false
        subtracao = false
        divisao = false


        posMemoria = preMemoria
        if (preMemoria != "") preMemoria = ""
    }

    fun funcaoDividir() {
        divisao = true
        posMemoria = preMemoria
        if (preMemoria != "") preMemoria = ""
    }


    fun funcaoSubtrair() {
        subtracao = true
        posMemoria = preMemoria
        if (preMemoria != "") preMemoria = ""

    }



    fun funcaoIgual() {

        if (adicao) {
            resultado = posMemoria.toInt() + preMemoria.toInt()
            visorGrande?.text = resultado.toString()
            preMemoria = resultado.toString()
            adicao = false //desliga o comando de somar
        }


        if (subtracao) {
            resultado = posMemoria.toInt() - preMemoria.toInt()
            visorGrande?.text = resultado.toString()
            preMemoria = resultado.toString()
            subtracao = false
        }

        if(multiplicacao){
            resultado = posMemoria.toInt() * preMemoria.toInt()
            visorGrande?.text = resultado.toString()
            preMemoria = resultado.toString()
            multiplicacao = false
        }

        if (divisao) {
            resultado = posMemoria.toInt() / preMemoria.toInt()
            visorGrande?.text = resultado.toString()
            preMemoria = resultado.toString()
            divisao = false
        }


    }



    fun guardaMemoria() {
        visorGrande?.text = preMemoria
    }

    fun tecla1() {
        preMemoria += "1"
        guardaMemoria()
    }

    fun tecla2() {
        preMemoria += "2"
        guardaMemoria()
    }

    fun tecla3() {
        preMemoria += "3"
        guardaMemoria()
    }

    fun tecla4() {
        preMemoria += "4"
        guardaMemoria()
    }

    fun tecla5() {
        preMemoria += "5"
        guardaMemoria()
    }

    fun tecla6() {
        preMemoria += "6"
        guardaMemoria()
    }

    fun tecla7() {
        preMemoria += "7"
        guardaMemoria()
    }

    fun tecla8() {
        preMemoria += "8"
        guardaMemoria()
    }

    fun tecla9() {
        preMemoria += "9"
        guardaMemoria()
    }

    fun tecla0() {
        preMemoria += "0"
        guardaMemoria()
    }


    fun iniciaComponentes() {

        visorGrande = findViewById<TextView>(R.id.visorGrande)

        teclaC = findViewById(R.id.teclaC)
        teclaAdicao = findViewById(R.id.teclaAdicao)
        teclaSubtracao = findViewById(R.id.teclaSubtracao)
        teclaMultiplicacao = findViewById(R.id.teclaMultiplicacao)
        teclaDivisao = findViewById(R.id.teclaDivisao)


        teclaIgual = findViewById(R.id.teclaIgual)

        tecla1 = findViewById(R.id.tecla1)
        tecla2 = findViewById(R.id.tecla2)
        tecla3 = findViewById(R.id.tecla3)
        tecla4 = findViewById(R.id.tecla4)
        tecla5 = findViewById(R.id.tecla5)
        tecla6 = findViewById(R.id.tecla6)
        tecla7 = findViewById(R.id.tecla7)
        tecla8 = findViewById(R.id.tecla8)
        tecla9 = findViewById(R.id.tecla9)
        tecla0 = findViewById(R.id.tecla0)
    }


}


//Ao apertar a tecla uma segunda vez, o numero queve ser incorporado como casa decimal: 4,44,444 -- OK
//Tecla C deve apagar o conteudo e substituir a preMemoria por um zero --OK

//Limitir o visor Grande à X caracteres
//Logica para o botão igual não quebrar a aplicacao
//Tecla 0 só pode informar um zero se o visor estiver limpo