package main.kotlin.models

class ContaCorrente(
    titular: String,
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
            println("Saque feito na conta: ${this.titular}")
            println("Novo saldo: ${this.saldo}")
        } else {
            println("Saldo insuficiente na conta: ${this.titular}.")
            println("Saldo atual: ${this.saldo}")
        }
    }

}