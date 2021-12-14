package com.johnny.jbank.modelo

/*
* Variaveis do endereco serão inicializadas como vazio para que não
* sejam obrigatorias
* */

class Endereco(
    val logradouro: String = "",
    val numero: Int = 0,
    val bairro: String = "",
    val cidade: String = "",
    var cep: String = "",
    var complemento: String = ""
)

//Analisar necessidade de override no toString