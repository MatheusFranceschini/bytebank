package main.kotlin.br.com.alura.bytebank.models

class ContaPoupanca(
    titular: Cliente,
    agencia: Int,
    conta: Int
): Conta(
    titular = titular,
    agencia = agencia,
    conta = conta
) {
    override fun sacar(valor: Double) {
        println("--------SAQUE--------")
        if (this.saldo >= valor) {
            saldo -= valor
            println("Saque feito na conta: ${titular.nome}")
            println("Novo saldo: ${this.saldo}")
        } else {
            println("Saldo insuficiente na conta: ${titular.nome}.")
            println("Saldo atual: ${this.saldo}")
        }
    }

}