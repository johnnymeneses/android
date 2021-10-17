package com.johnny.jmail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class formLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_login)

        //versão Kotlin
        supportActionBar!!.hide()

    }
}