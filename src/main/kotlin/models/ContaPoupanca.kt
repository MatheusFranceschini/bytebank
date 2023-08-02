package main.kotlin.models

class ContaPoupanca(
    titular: String,
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
            println("Saque feito na conta: ${this.titular}")
            println("Novo saldo: ${this.saldo}")
        } else {
            println("Saldo insuficiente na conta: ${this.titular}.")
            println("Saldo atual: ${this.saldo}")
        }
    }

}