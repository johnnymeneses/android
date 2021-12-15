package com.johnny.jbank.modelo


//Implementar para a realidade do JBank

abstract interface IAutenticavel{
    abstract val titular: Any

    abstract fun autentica (senha: Int): Boolean
}