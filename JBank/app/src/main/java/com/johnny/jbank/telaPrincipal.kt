package com.johnny.jbank

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class telaPrincipal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_principal)


        //Escondendo o header
        supportActionBar!!.hide()

        buscaCLiente()


        val botaoDepositar = findViewById<Button>(R.id.btn_depositar)
        val botaoSacar = findViewById<Button>(R.id.btn_sacar)
        val botaoTranferir = findViewById<Button>(R.id.btn_Transferir)

        botaoDepositar.setOnClickListener() {
            TelaDeposito()
        }

        botaoSacar.setOnClickListener() {
            TelaSaque()
        }

        botaoTranferir.setOnClickListener() {
            TelaTransferencia()
        }


    }

    @SuppressLint("SetTextI18n")
    fun buscaCLiente() {


        //Refatorar: Incluir metodo de iniciar componentes
        //Refatorar: Incluir metodo que traz os dados do cliente

        val nome = findViewById<TextView>(R.id.text_person)
        val saldo = findViewById<TextView>(R.id.text_saldocliente)

//        nome.setText(jm.nome)
//        saldo.setText("R$ ${john.saldo.toString()}")

    }


    private fun TelaDeposito() {
        val intent = Intent(this, telaDeposito::class.java)
        startActivity(intent)
//        finish()
    }

    private fun TelaSaque() {
        val intent = Intent(this, telaSaque::class.java)
        startActivity(intent)
//        finish()
    }

    private fun TelaTransferencia() {
        val intent = Intent(this, telaTransferencia::class.java)
        startActivity(intent)
//        finish()
    }


}