package com.johnny.udemy2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ex01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex01)

        supportActionBar!!.hide()

    }
}