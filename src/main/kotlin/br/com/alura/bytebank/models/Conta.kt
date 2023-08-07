package main.kotlin.br.com.alura.bytebank.models

//Variaveis globais são criadas fora do escopo
//var totalContas:Int = 0
//    private set

abstract class Conta(
    var titular: Cliente,
    val agencia: Int,
    val conta: Int
) {
    var saldo: Double = 0.0
        protected set


    //O companion object permite que a gente crie um Singleton dentro da classe (objeto que será mantido do início ao fim no código
    //e compartilhe suas propriedades com a classe. Com o Private Set, limitamos a atualização do valor para que apenas a Conta possa fazer
    companion object Contador{
        var total = 0
            private set
    }

    //Com o método init, toda vez que uma classe for criada, o contador irá aumentar.
    init{
        total++
    }

    fun depositar(valor: Double) {
        println("--------DEPOSITO--------")
        if (valor > 0) {
            this.saldo += valor
        }
        println("$valor adicionado na conta: ${titular.nome}")
        println("Novo saldo: ${this.saldo}")
    }

    abstract fun sacar(valor: Double)

    fun transferir(valor: Double, contaDestino: Conta): Boolean {
        println("--------TRANSFERÊNCIA--------")
        if (saldo >= valor) {
            saldo -= valor
            contaDestino.depositar(valor)
            return true
        }
        return false
    }

//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        if (valor > 0) {
//            saldo = valor
//        }
//    }
}

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