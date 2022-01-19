package com.johnny.convidados.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodosViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Todos os Convidados"
    }
    val text: LiveData<String> = _text
}