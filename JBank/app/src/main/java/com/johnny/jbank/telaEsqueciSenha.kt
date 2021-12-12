package com.johnny.jbank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class telaEsqueciSenha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_esqueci_senha)

        //Escondendo o header
        supportActionBar!!.hide()

    }
}