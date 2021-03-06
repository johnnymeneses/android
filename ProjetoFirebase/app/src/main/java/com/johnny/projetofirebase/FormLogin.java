package com.johnny.projetofirebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import com.google.firebase.auth.FirebaseUser;

public class FormLogin extends AppCompatActivity {

    private TextView text_telaCadastro;
    private EditText edit_email;
    private EditText edit_senha;
    private Button btn_login;
    private ProgressBar progressBar;

    String[] mensagens = {"Preencha todos os campos","Login realizado com Sucesso"};


    private void AutenticarUsuario(View view){
        String email = edit_email.getText().toString();
        String senha = edit_senha.getText().toString();


        FirebaseAuth.getInstance().signInWithEmailAndPassword(email,senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()) {
                    progressBar.setVisibility(View.VISIBLE);

                    //transição de 3 segundos
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            TelaPrincipal();
                        }
                    },3000);

                }else{
                    String erro;

                    try {
                        throw task.getException();

                    }catch (FirebaseAuthInvalidUserException e){ //Senha menor que 6 caracteres
                        erro = "Usuario Invalido";
                    }catch (FirebaseAuthInvalidCredentialsException e){ //Senha de email já cadastrado
                        erro = "Senha Inválida";
                    }catch (Exception e){
                        erro = "Erro ao Logar Usuário";
                    }

                    //Snackbar com a mensagem de erro
                    Snackbar snackbar = Snackbar.make(view,erro,Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();

                }

            }
        });
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

    private void TelaPrincipal(){
        Intent intent = new Intent(FormLogin.this,TelaPrincipal.class);
        startActivity(intent);
        finish();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();
        iniciarComponentes();

        text_telaCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormLogin.this, formCadastro.class);
                startActivity(intent);
            }
        });


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edit_email.getText().toString();
                String senha = edit_senha.getText().toString();

                if(email.isEmpty() || senha.isEmpty()){
                    Snackbar snackbar = Snackbar.make(view, mensagens[0], Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.WHITE);
                    snackbar.setTextColor(Color.BLACK);
                    snackbar.show();
                }else
                {
                    AutenticarUsuario(view);
                }


            }
        });



    }

    private void iniciarComponentes(){

        text_telaCadastro = findViewById(R.id.text_tela_cadastro);
        edit_email = findViewById(R.id.edit_email);
        edit_senha = findViewById(R.id.edit_senha);
        btn_login = findViewById(R.id.bt_entrar);
        progressBar = findViewById(R.id.progressbar);

    }

}