package com.johnny.jbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class telaSaque : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_saque)

        supportActionBar!!.hide()

        val botaoSaque = findViewById<Button>(R.id.btn_saque)

        botaoSaque.setOnClickListener(){
            sacarRecurso()
        }

    }

    fun sacarRecurso(){
        val campoValor = findViewById<EditText>(R.id.edit_valor_saque)
        val valorSaque = campoValor.text.toString()
        john.sacarRecurso(valorSaque.toDouble())
        finish()
        TelaPrincipal()

    }

    private fun TelaPrincipal() {
        val intent = Intent(this, telaPrincipal::class.java)
        startActivity(intent)
        finish()
    }
}