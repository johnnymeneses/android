package com.johnny.projetofirebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class formCadastro extends AppCompatActivity {

    //Criando Objetos
    private EditText edit_nome;
    private EditText edit_email;
    private EditText edit_senha;
    private Button bt_cadastrar;

    String[] mensagens = {"Preencha todos os campos","Cadastro Realizado com Sucesso"};

    private void IniciarComponentes(){

        //Recuperando os ID's dos campos da Tela de Cadastro
        edit_nome = findViewById(R.id.edit_nome);
        edit_email = findViewById(R.id.edit_email);
        edit_senha = findViewById(R.id.edit_senha);
        bt_cadastrar = findViewById((R.id.btn_cadastro));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);
        getSupportActionBar().hide();

        //Inicializar o método
        IniciarComponentes();

        //Botao escuta eventos de click
        bt_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Capturar o que o usuário está digitando
                String nome = edit_nome.getText().toString();
                String email = edit_email.getText().toString();
                String senha = edit_senha.getText().toString();

                //Validando se os campos estão vazios
                if (nome.isEmpty() || senha.isEmpty() || email.isEmpty()) {
                    //Mensagem NOK
                    Snackbar snackbar = Snackbar.make(view, mensagens[0], Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                } else {
                    CadastrarUsuario(view);
                }

            }


        });
    }

        private void CadastrarUsuario(View view) {

            String email = edit_email.getText().toString();
            String senha = edit_senha.getText().toString();

            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email,senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        //Mensagem OK
                        Snackbar snackbar = Snackbar.make(view,mensagens[1],Snackbar.LENGTH_SHORT);
                        snackbar.setBackgroundTint(Color.WHITE);
                        snackbar.setTextColor(Color.BLACK);
                        snackbar.show();

                        //Apagando os campos
                        edit_nome.setText("");
                        edit_senha.setText("");
                        edit_email.setText("");

                        //Setando o Focus no campo nome

                    }


                }
            });







        }




    }









