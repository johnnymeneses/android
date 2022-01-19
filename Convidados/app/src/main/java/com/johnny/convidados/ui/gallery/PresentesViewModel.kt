package com.johnny.convidados.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PresentesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Lista de Presentes"
    }
    val text: LiveData<String> = _text
}