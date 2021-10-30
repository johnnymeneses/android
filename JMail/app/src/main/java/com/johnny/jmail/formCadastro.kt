package com.johnny.jmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText



class formCadastro : AppCompatActivity() {

    //Criando Objetos
    private var edit_nome:  EditText? = null
    private var edit_email: EditText? = null
    private var edit_senha: EditText?= null
    private var btn_cadastrar: Button?= null

    var usuarioID: String? = null






    //Mensagens de Erro
    var mensagens: Array<String> =
        arrayOf<String>("Preencha todos os campos", "Cadastro Realizado com Sucesso")

    private fun IniciarComponentes() {

        //Recuperando os ID's dos campos da Tela de Cadastro
        edit_nome = findViewById(R.id.edit_nome)
        edit_email = findViewById(R.id.edit_email)
        edit_senha = findViewById(R.id.edit_senha)
        btn_cadastrar = findViewById<Button>(R.id.btn_cadastro)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_cadastro)

        //Escondendo o header roxo
        supportActionBar!!.hide()



    }
}