package com.johnny.jbank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class telaCadastrese : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_cadastrese)

        //Escondendo o header
        supportActionBar!!.hide()
    }
}