package com.johnny.jbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.johnny.jbank.modelo.Cliente
import com.johnny.jbank.modelo.contaCorrente

class telaDeposito : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_deposito)

        supportActionBar!!.hide()


        val botaoDeposito = findViewById<Button>(R.id.btn_deposito)

        botaoDeposito.setOnClickListener(){
            depositoRecurso()
        }

    }

    fun depositoRecurso(){
        val campoValor = findViewById<EditText>(R.id.edit_valor_deposito)
        val valorDeposito = campoValor.text.toString()
        john.depositaRecurso(valorDeposito.toDouble())

        TelaPrincipal()
    }


    private fun TelaPrincipal() {
        val intent = Intent(this, telaPrincipal::class.java)
        startActivity(intent)
        finish()
    }

    //Chama o Objeto Cliente




}