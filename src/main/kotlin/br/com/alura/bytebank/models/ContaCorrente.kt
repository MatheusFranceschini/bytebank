package main.kotlin.br.com.alura.bytebank.models

class ContaCorrente(
    titular: Cliente,
    agencia: Int,
    conta: Int,
): Conta(
    titular = titular,
    agencia = agencia,
    conta = conta
) {

    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1

        println("--------SAQUE--------")
        if (this.saldo >= valorComTaxa) {
            saldo -= valorComTaxa
            println("Saque feito na conta: ${titular.nome}")
            println("Novo saldo: ${this.saldo}")
        } else {
            println("Saldo insuficiente na conta: ${titular.nome}.")
            println("Saldo atual: ${this.saldo}")
        }
    }

}