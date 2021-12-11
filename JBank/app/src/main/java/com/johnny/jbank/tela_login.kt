package com.johnny.jbank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class tela_login : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_login)


        //Escondendo o header
        supportActionBar!!.hide()


        //Chama o Evento pelo botão

        val botaoEntrar = findViewById<Button>(R.id.btn_entrar)
        botaoEntrar.setOnClickListener() {
            dadosLogin()
        }


    }

    fun dadosLogin() {

        val email = findViewById<EditText>(R.id.edit_mail)
        val valorMail = email.text.toString()

        val senha = findViewById<EditText>(R.id.edit_senha)
        val valorSenha = senha.text.toString()

        println("Dados email $valorMail")
        println("Dados senha $valorSenha")

    }


}


//Pegar os dados do campo email
//pegar os dados do campo senha
//evento no botão para ir para outra tela se dados estiverem certos
//mensagem de erro se dados estiverem errados