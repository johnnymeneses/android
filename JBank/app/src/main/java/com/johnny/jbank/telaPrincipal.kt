package com.johnny.jbank

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.EditText
import android.widget.TextView
import com.johnny.jbank.modelo.Cliente
import com.johnny.jbank.modelo.contaCorrente

class telaPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_principal)


        //Escondendo o header
        supportActionBar!!.hide()

        buscaCLiente()












    }

    @SuppressLint("SetTextI18n")
    fun buscaCLiente() {

        val john = Cliente("Johnny Meneses","12345678",123456)
        val cj = contaCorrente(john,12345,6655441)


        val nome = findViewById<TextView>(R.id.text_person)
        val saldo = findViewById<TextView>(R.id.text_saldocliente)

        nome.setText(cj.titular.nome)
        saldo.setText("R$ ${cj.saldo.toString()}")



    }
}