package com.johnny.jmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class formLogin : AppCompatActivity() {

    private val text_telaCadastro: TextView? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_login)

//        Escondendo o header roxo
            supportActionBar!!.hide()

    }
}