package com.johnny.jbank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class telaPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_principal)


        //Escondendo o header
        supportActionBar!!.hide()


    }
}