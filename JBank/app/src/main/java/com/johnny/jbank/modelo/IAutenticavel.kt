package com.johnny.jbank.modelo


//Implementar para a realidade do JBank

abstract interface IAutenticavel{
    abstract fun autentica (senha: Int): Boolean
}