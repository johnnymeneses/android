package com.johnny.udemy2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageView

class ex02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex02)


        supportActionBar!!.hide()


        var checkBox = findViewById<CheckBox>(R.id.check)
        var imagem = findViewById<ImageView>(R.id.finger)

        checkBox.setOnClickListener() {
            if (checkBox.isChecked){
                imagem.setColorFilter(resources.getColor(R.color.red))
            }else {
                imagem.setColorFilter(resources.getColor(R.color.black))
            }

        }
    }
}


