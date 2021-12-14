package com.johnny.jbank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.johnny.jbank.modelo.Cliente

class telaPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_principal)


        //Escondendo o header
        supportActionBar!!.hide()

        buscaCLiente()












    }

    fun buscaCLiente() {

        val john = Cliente("Johnny Meneses","12345678",123456)

        val nome = findViewById<TextView>(R.id.text_person)
        val saldo = findViewById<TextView>(R.id.text_saldocliente)

        nome.setText(john.nome)
        saldo.setText("R$ 10.450,00")



    }
}