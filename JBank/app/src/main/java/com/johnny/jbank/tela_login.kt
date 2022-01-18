package com.johnny.jbank

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class tela_login : AppCompatActivity() {

    private var TextView text_telaCadastro;
    private var EditText edit_email;
    private var EditText edit_senha;
    private var Button btn_login;
    private var ProgressBar progressBar;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_login)


        //Escondendo o header
        supportActionBar!!.hide()

    }


}

