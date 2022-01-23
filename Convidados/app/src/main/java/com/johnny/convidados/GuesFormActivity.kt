package com.johnny.convidados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class GuesFormActivity : AppCompatActivity(), View.OnClickListener {

    var button_save = findViewById<Button>(R.id.btn_salvar)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_cadastro)


        setListeners()

    }



    private fun setListeners(){
        button_save.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        val id = v.id
//        if( id==button_save)
        {

        }
    }


}