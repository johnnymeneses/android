package com.johnny.jbank.modelo


class contaCorrente(
    titular: Cliente,
    agencia: Int,
    numeroConta: Int
) : Conta(titular, agencia, numeroConta) {






    override fun depositaRecurso(valor: Double) {
        if (valor <= 0) {
            //Implementar throw
            println("Valor incorreto")
        } else {
            this.saldo += valor
        }
    }

    //Implementar os outros metodos

    override fun sacarRecurso(valor: Double) {
        TODO("Not yet implemented")
    }

    override fun transferirRecurso(valor: Double, contaDestino: Conta) {
        TODO("Not yet implemented")
    }


}