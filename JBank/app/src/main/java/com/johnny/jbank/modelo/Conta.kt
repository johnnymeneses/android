package com.johnny.jbank.modelo

abstract class Conta(
    val titular: Cliente,
    val agencia: Int,
    val numeroConta: Int
) {

    var saldo: Double = 1000.0
        protected set

    abstract fun depositaRecurso(valor: Double)
    abstract fun sacarRecurso(valor: Double)
    abstract fun transferirRecurso(valor: Double, contaDestino: Conta)



}