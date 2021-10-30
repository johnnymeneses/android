package com.johnny.jmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class tela_principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_principal)

        //        Escondendo o header roxo
        supportActionBar!!.hide()

    }
}