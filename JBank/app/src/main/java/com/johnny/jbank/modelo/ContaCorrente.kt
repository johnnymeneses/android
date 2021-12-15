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
        //Não permitir saque com valor negativo
        if(valor<=0){
//            throw  ValorInvalidoException(mensagem = "CC - R$$valor é um invalido. Operação cancelada")
            println("R$$valor é um invalido. Operação cancelada")
        }

        if(saldo<valor){
//            throw  SaldoInsuficienteException(mensagem = "CC - Saldo R$$saldo insuficiente para o saque de R$ $valor")
            println("Saldo R$$saldo insuficiente para o saque de R$ $valor")
        }

        saldo-=valor
    }

    override fun transferirRecurso(valor: Double, contaDestino: Conta) {
        TODO("Not yet implemented")
    }


}