package com.johnny.convidados.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AusentesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Lista de Ausentes"
    }
    val text: LiveData<String> = _text
}