package com.johnny.jbank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    val senha: Int,
    val endereco: Endereco = Endereco() //Tecnica para não exigir que o endereço seja instanciado sempre
) : IAutenticavel{

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }



}
