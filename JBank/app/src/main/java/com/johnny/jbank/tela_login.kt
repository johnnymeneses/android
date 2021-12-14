package com.johnny.jbank

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

class tela_login : AppCompatActivity() {







    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_login)


        //Classe com mensagens do Sistema
        val mensagem = strings()



        //Escondendo o header
        supportActionBar!!.hide()

        //chama evento Esqueci Sennha



        //Chama evento Cadastrar





        //Chama o evento Entrar
        val botaoEntrar = findViewById<Button>(R.id.btn_entrar)
        botaoEntrar.setOnClickListener() {


            if (validaentrada()) {
                println("Entrada permitida")

                TelaPrincipal()


            } else {
                //Snackbar com a mensagem de erro

                val snack = Snackbar.make(it,mensagem.mensagemErro(),Snackbar.LENGTH_LONG)
                snack.setBackgroundTint(Color.WHITE)
                snack.setTextColor(Color.BLACK)
                snack.show()

            }
        }


    }


    //    @Override
    //    protected void onStart() {
    //        super.onStart();
    //
    //        FirebaseUser usuarioatual = FirebaseAuth.getInstance().getCurrentUser();
    //        if(usuarioatual!=null){
    //            TelaPrincipal();
    //        }
    //    }
    private fun TelaPrincipal() {
        val intent = Intent(this,telaPrincipal::class.java)
        startActivity(intent)
        finish()
    }


    fun validaentrada(): Boolean {

        val campoEmail = findViewById<EditText>(R.id.edit_mail)
        val campoSenha = findViewById<EditText>(R.id.edit_senha)

        val valorMail = campoEmail.text.toString()
        val valorSenha = campoSenha.text.toString()

//        println("Dados email $valorMail")
//        println("Dados senha $valorSenha")


//        return !(valorMail != "email" && valorSenha != "12345")
        return (valorMail == "email" && valorSenha == "12345")

    }






}

